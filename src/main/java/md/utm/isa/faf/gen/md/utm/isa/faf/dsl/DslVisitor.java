package md.utm.isa.faf.gen.md.utm.isa.faf.dsl;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import md.utm.isa.faf.ExportService;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities.*;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.enums.Currency;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.enums.FinTypes;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.xmlbeans.impl.store.Cur;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

@Data
public class DslVisitor extends DslParserBaseVisitor{
    private final Asset asset = new Asset();
    private final Liability liability = new Liability();
    private final Equity equity =  new Equity();

    private BalanceSheet balanceSheet = new BalanceSheet();
    private FinEntity finEntity = new FinEntity();

    private final List<BalanceSheet> balanceSheets = new ArrayList<>();

    private final Map<Integer,String> newDeclaredMap = new HashMap<>();

    private List<FinEntity> finEntities = new ArrayList<>();

    private List<Map.Entry<String, String>> entitySheetRel = new ArrayList<>();


    @Override
    public Object visitProgram(DslParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitDeclaration(DslParser.DeclarationContext ctx) {
        String dec = ctx.getChild(0).getText();

        if (dec.equals("print")) {
            System.out.println("PRINTED");
        }

        if (dec.equals("calcTax")) {
            System.out.println("taxCalc");
        }
        return super.visitDeclaration(ctx);
    }

    @Override
    public Object visitClassDecl(DslParser.ClassDeclContext ctx) {
        return super.visitClassDecl(ctx);
    }

    @Override
    public Object visitFunDecl(DslParser.FunDeclContext ctx) {
        return super.visitFunDecl(ctx);
    }

    @Override
    public Object visitVarDecl(DslParser.VarDeclContext ctx) {
        String finEntityName = ctx.getChild(1).getText();
        finEntity.setName(finEntityName);
        String finEnityType = ctx.getChild(4).getChild(0).getText();

        if (!FinTypes.contains(finEnityType)) {
            throw new RuntimeException("Invalid financial type");
        }

        finEntity.setFinTypes(FinTypes.getFinTypeByName(finEnityType));


        return super.visitVarDecl(ctx);
    }

    @Override
    public Object visitFinDecl(DslParser.FinDeclContext ctx) {
        return super.visitFinDecl(ctx);
    }

    @Override
    public Object visitBalanceSheet(DslParser.BalanceSheetContext ctx) {
        balanceSheet = new BalanceSheet();

        balanceSheet.setName(ctx.children.get(1).getText());
        newDeclaredMap.clear();

        validateSheet(balanceSheet);

        Object resCtx = super.visitBalanceSheet(ctx);
        balanceSheets.add(balanceSheet);
        return resCtx;
    }

    private void validateSheet(BalanceSheet newSheet) {
        // search for duplicate names
        // todo export this validation to all variables
        if (balanceSheets.stream().map(BalanceSheet::getName).collect(Collectors.toSet()).contains(newSheet.getName())) {
            throw new RuntimeException(String.format("Error in balance sheet declaration. Duplicate identifier %s", newSheet.getName()));
        }

    }

    @Override
    public Object visitIncomeState(DslParser.IncomeStateContext ctx) {
        return super.visitIncomeState(ctx);
    }

    @Override
    public Object visitBal_assets(DslParser.Bal_assetsContext ctx) {
        newDeclaredMap.put(ctx.invokingState, ctx.start.getText());
        return super.visitBal_assets(ctx);
    }

    @Override
    public Object visitBal_liab(DslParser.Bal_liabContext ctx) {
        newDeclaredMap.put(ctx.invokingState, ctx.start.getText());
        return super.visitBal_liab(ctx);
    }

    @Override
    public Object visitBal_equity(DslParser.Bal_equityContext ctx) {
        newDeclaredMap.put(ctx.invokingState, ctx.start.getText());
        return super.visitBal_equity(ctx);
    }

    @Override
    public Object visitAsset_ex(DslParser.Asset_exContext ctx) {
        if (!newDeclaredMap.containsKey(ctx.getParent().invokingState) ||
                !newDeclaredMap.get(ctx.getParent().invokingState).equals("assets")) {
            throw new RuntimeException("No assets declared");
        }

        String assetName = ctx.getChild(0).getText();
        double val;

        try {
            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
            Number number = format.parse(ctx.expression().assignment().getText());
            val = number.doubleValue();
        } catch (Exception ex) {
            throw new RuntimeException("Error in assignment. The value is not a number");

        }
        switch (assetName) {
            case "cash":
                asset.setCash(val);
                break;
            case "expenses":
                asset.setExpenses(val);
                break;
            case "inventory":
                asset.setInventory(val);
                break;
            case "accounts":
                asset.setAccounts(val);
                break;
            case "long term":
                asset.setLongTerm(val);
                break;
            default:
                throw new RuntimeException(String.format("Unsupported field %s in assets", assetName) );
        }

        balanceSheet.setAsset(asset);

        return super.visitAsset_ex(ctx);
    }

    @Override
    public Object visitLiab_ex(DslParser.Liab_exContext ctx) {
        if (!newDeclaredMap.containsKey(ctx.getParent().invokingState) ||
                !newDeclaredMap.get(ctx.getParent().invokingState).equals("liabilities")) {
            throw new RuntimeException("No liability declared");
        }
        String liabName = ctx.getChild(0).getText();
        double val;

        try {
            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
            Number number = format.parse(ctx.expression().assignment().getText());
            val = number.doubleValue();
        } catch (Exception ex) {
            throw new RuntimeException("Error in assignment. Value not a number");

        }
        switch (liabName) {
            case "others":
                liability.setOthers(val);
                break;
            case "accounts":
                liability.setAccounts(val);
                break;
            case "long term":
                liability.setLongTerm(val);
                break;
            default:
                throw new RuntimeException(String.format("Unsupported field %s in liabilities", liabName) );
        }

        balanceSheet.setLiability(liability);
        return super.visitLiab_ex(ctx);
    }

    @Override
    public Object visitEquity_ex(DslParser.Equity_exContext ctx) {
        if (!newDeclaredMap.containsKey(ctx.getParent().invokingState) ||
                !newDeclaredMap.get(ctx.getParent().invokingState).equals("equity")) {
            throw new RuntimeException("No equity declared");
        }
        String equityName = ctx.getChild(0).getText();
        double val;

        try {
            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
            Number number = format.parse(ctx.expression().assignment().getText());
            val = number.doubleValue();
        } catch (Exception ex) {
            throw new RuntimeException("Error in assignment.");

        }
        switch (equityName) {
            case "capital":
                equity.setCapital(val);
                break;
            case "retained":
                equity.setRetained(val);
                break;
            default:
                throw new RuntimeException(String.format("Unsupported field %s in equity", equityName) );
        }

        balanceSheet.setEquity(equity);

        return super.visitEquity_ex(ctx);
    }

    @Override
    public Object visitStatement(DslParser.StatementContext ctx) {
        if (finEntity!=null && finEntity.getName()!=null) {
            if (!finEntities.stream()
                    .map(e -> e.getName())
                    .collect(Collectors.toList())
                    .contains(finEntity.getName())) {
                for (int i =1; i< ctx.getChild(0).getChildCount()-1; i++) {
                    String[] splitted = ctx.getChild(0).getChild(i).getText().split("=");
                    if (splitted.length==2 && splitted[0].equals("currency") && Currency.contains(splitted[1].replace(";", ""))) {
                        finEntity.setCurrency(Currency.getCurrencyByName(splitted[1].replace(";", "")));
                    } else {
                        try {
                            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
                            Number number = format.parse(splitted[1].replace(";", ""));
                            finEntity.getVars().put(splitted[0],  number.doubleValue());
                        } catch (Exception ex) {
                            throw new RuntimeException(ex.getMessage());
                        }

                    }

                }

                finEntities.add(finEntity);

            }
        }
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitExprStmt(DslParser.ExprStmtContext ctx) {
        return super.visitExprStmt(ctx);
    }

    @Override
    public Object visitForStmt(DslParser.ForStmtContext ctx) {
        return super.visitForStmt(ctx);
    }

    @Override
    public Object visitIfStmt(DslParser.IfStmtContext ctx) {
        return super.visitIfStmt(ctx);
    }

    @Override
    public Object visitReturnStmt(DslParser.ReturnStmtContext ctx) {
        return super.visitReturnStmt(ctx);
    }

    @Override
    public Object visitWhileStmt(DslParser.WhileStmtContext ctx) {
        return super.visitWhileStmt(ctx);
    }

    @Override
    public Object visitBlock(DslParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Object visitExpression(DslParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitAssignment(DslParser.AssignmentContext ctx) {
        return super.visitAssignment(ctx);
    }

    @Override
    public Object visitLogic_or(DslParser.Logic_orContext ctx) {
        return super.visitLogic_or(ctx);
    }

    @Override
    public Object visitLogic_and(DslParser.Logic_andContext ctx) {
        return super.visitLogic_and(ctx);
    }

    @Override
    public Object visitEquality(DslParser.EqualityContext ctx) {
        return super.visitEquality(ctx);
    }

    @Override
    public Object visitComparison(DslParser.ComparisonContext ctx) {
        return super.visitComparison(ctx);
    }

    @Override
    public Object visitTerm(DslParser.TermContext ctx) {
        return super.visitTerm(ctx);
    }

    @Override
    public Object visitFactor(DslParser.FactorContext ctx) {
        return super.visitFactor(ctx);
    }

    @Override
    public Object visitUnary(DslParser.UnaryContext ctx) {
        return super.visitUnary(ctx);
    }

    @Override
    public Object visitCall(DslParser.CallContext ctx) {
        return super.visitCall(ctx);
    }

    @Override
    public Object visitPrimary(DslParser.PrimaryContext ctx) {
        return super.visitPrimary(ctx);
    }

    @Override
    public Object visitFunction(DslParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }

    @Override
    public Object visitParameters(DslParser.ParametersContext ctx) {
        return super.visitParameters(ctx);
    }

    @Override
    public Object visitArguments(DslParser.ArgumentsContext ctx) {
        return super.visitArguments(ctx);
    }

    @Override
    public Object visitBal_sheet_assets(DslParser.Bal_sheet_assetsContext ctx) {
        return super.visitBal_sheet_assets(ctx);
    }

    @Override
    public Object visitBal_sheet_liab(DslParser.Bal_sheet_liabContext ctx) {
        return super.visitBal_sheet_liab(ctx);
    }

    @Override
    public Object visitBal_sheet_equity(DslParser.Bal_sheet_equityContext ctx) {
        return super.visitBal_sheet_equity(ctx);
    }

    @Override
    public Object visitEntities(DslParser.EntitiesContext ctx) {
        return super.visitEntities(ctx);
    }

    @Override
    public Object visitMain_functions(DslParser.Main_functionsContext ctx) {
        if (ctx.start.getText().equals("export")) {
            String sheetName = ctx.parent.getChild(2).getText();

            Optional<BalanceSheet> sheet = balanceSheets.stream().filter(s -> s.getName().equals(sheetName)).findFirst();

            if (sheet.isEmpty()) {
                throw new RuntimeException(String.format("Could not find sheet with name %s", sheetName));
            }

            try {
                ExportService.exportBalanceSheetToXLSX(sheet.get());
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }

        if (ctx.start.getText().equals("print")) {
            String printName = ctx.parent.getChild(2).getText();

            Optional<BalanceSheet> sheet = balanceSheets.stream().filter(s -> s.getName().equals(printName)).findFirst();

            if (sheet.isEmpty()) {
                Optional<FinEntity> entity = finEntities.stream().filter(s -> s.getName().equals(printName)).findFirst();

                if (entity.isEmpty()) {
                    throw new RuntimeException(String.format("Could not find variables with name %s", printName));
                }

                System.out.println(entity.get());
            } else {
                System.out.println(sheet.get());
            }

        }

        if (ctx.start.getText().equals("calcTax")) {
            String args = ctx.parent.getChild(2).getText();

            String[] splitArgs = args.split(",");
            List<String> sss = Arrays.stream(splitArgs).map(s -> s.trim()).collect(Collectors.toList());

            if (sss.size() !=2) {
                throw new RuntimeException("Invalid number of arguments");
            }

            Optional<FinEntity> fe = finEntities.stream().filter(s-> s.getName().equals(sss.get(0))).findFirst();

            if (fe.isEmpty()) {
                throw new RuntimeException("Invalid financial entity");
            }

            try
            {
                Double.parseDouble(sss.get(1));
            }
            catch(NumberFormatException e)
            {
                throw new RuntimeException("Second arg not a number");
            }

            TaxService.calculateTax(Double.parseDouble(sss.get(1)), fe.get(), fe.get().getVars().get("abstract_tax"));
        }
        return super.visitMain_functions(ctx);
    }
}
