package md.utm.isa.faf.gen.md.utm.isa.faf.dsl;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities.Asset;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities.BalanceSheet;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities.Equity;
import md.utm.isa.faf.gen.md.utm.isa.faf.dsl.entities.Liability;

import java.text.NumberFormat;
import java.util.*;

@Data
public class DslVisitor extends DslParserBaseVisitor{
    private final Asset asset = new Asset();
    private final Liability liability = new Liability();
    private final Equity equity =  new Equity();

    private final BalanceSheet balanceSheet = new BalanceSheet();

    private final Map<Integer,String> newDeclaredMap = new HashMap<>();


    @Override
    public Object visitProgram(DslParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitDeclaration(DslParser.DeclarationContext ctx) {
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
        return super.visitVarDecl(ctx);
    }

    @Override
    public Object visitFinDecl(DslParser.FinDeclContext ctx) {
        return super.visitFinDecl(ctx);
    }

    @Override
    public Object visitBalanceSheet(DslParser.BalanceSheetContext ctx) {
        return super.visitBalanceSheet(ctx);
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
}
