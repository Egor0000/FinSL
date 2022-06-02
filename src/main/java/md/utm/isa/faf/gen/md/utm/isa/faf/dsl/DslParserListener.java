// Generated from D:/EGOR/Projects/FinSL/FinSL/src/main/java/md/utm/isa/faf/dsl\DslParser.g4 by ANTLR 4.9.2
package md.utm.isa.faf.gen.md.utm.isa.faf.dsl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DslParser}.
 */
public interface DslParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DslParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DslParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DslParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DslParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DslParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(DslParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(DslParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#funDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunDecl(DslParser.FunDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#funDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunDecl(DslParser.FunDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(DslParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(DslParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#finDecl}.
	 * @param ctx the parse tree
	 */
	void enterFinDecl(DslParser.FinDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#finDecl}.
	 * @param ctx the parse tree
	 */
	void exitFinDecl(DslParser.FinDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#balanceSheet}.
	 * @param ctx the parse tree
	 */
	void enterBalanceSheet(DslParser.BalanceSheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#balanceSheet}.
	 * @param ctx the parse tree
	 */
	void exitBalanceSheet(DslParser.BalanceSheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#incomeState}.
	 * @param ctx the parse tree
	 */
	void enterIncomeState(DslParser.IncomeStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#incomeState}.
	 * @param ctx the parse tree
	 */
	void exitIncomeState(DslParser.IncomeStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#bal_assets}.
	 * @param ctx the parse tree
	 */
	void enterBal_assets(DslParser.Bal_assetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#bal_assets}.
	 * @param ctx the parse tree
	 */
	void exitBal_assets(DslParser.Bal_assetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#bal_liab}.
	 * @param ctx the parse tree
	 */
	void enterBal_liab(DslParser.Bal_liabContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#bal_liab}.
	 * @param ctx the parse tree
	 */
	void exitBal_liab(DslParser.Bal_liabContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#bal_equity}.
	 * @param ctx the parse tree
	 */
	void enterBal_equity(DslParser.Bal_equityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#bal_equity}.
	 * @param ctx the parse tree
	 */
	void exitBal_equity(DslParser.Bal_equityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#asset_ex}.
	 * @param ctx the parse tree
	 */
	void enterAsset_ex(DslParser.Asset_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#asset_ex}.
	 * @param ctx the parse tree
	 */
	void exitAsset_ex(DslParser.Asset_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#liab_ex}.
	 * @param ctx the parse tree
	 */
	void enterLiab_ex(DslParser.Liab_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#liab_ex}.
	 * @param ctx the parse tree
	 */
	void exitLiab_ex(DslParser.Liab_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#equity_ex}.
	 * @param ctx the parse tree
	 */
	void enterEquity_ex(DslParser.Equity_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#equity_ex}.
	 * @param ctx the parse tree
	 */
	void exitEquity_ex(DslParser.Equity_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DslParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DslParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(DslParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(DslParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(DslParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(DslParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(DslParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(DslParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(DslParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(DslParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(DslParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(DslParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DslParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DslParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DslParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DslParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DslParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DslParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#logic_or}.
	 * @param ctx the parse tree
	 */
	void enterLogic_or(DslParser.Logic_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#logic_or}.
	 * @param ctx the parse tree
	 */
	void exitLogic_or(DslParser.Logic_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#logic_and}.
	 * @param ctx the parse tree
	 */
	void enterLogic_and(DslParser.Logic_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#logic_and}.
	 * @param ctx the parse tree
	 */
	void exitLogic_and(DslParser.Logic_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(DslParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(DslParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DslParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DslParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DslParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DslParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(DslParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(DslParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(DslParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(DslParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(DslParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(DslParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(DslParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(DslParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DslParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DslParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(DslParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(DslParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(DslParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(DslParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#bal_sheet_assets}.
	 * @param ctx the parse tree
	 */
	void enterBal_sheet_assets(DslParser.Bal_sheet_assetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#bal_sheet_assets}.
	 * @param ctx the parse tree
	 */
	void exitBal_sheet_assets(DslParser.Bal_sheet_assetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#bal_sheet_liab}.
	 * @param ctx the parse tree
	 */
	void enterBal_sheet_liab(DslParser.Bal_sheet_liabContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#bal_sheet_liab}.
	 * @param ctx the parse tree
	 */
	void exitBal_sheet_liab(DslParser.Bal_sheet_liabContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#bal_sheet_equity}.
	 * @param ctx the parse tree
	 */
	void enterBal_sheet_equity(DslParser.Bal_sheet_equityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#bal_sheet_equity}.
	 * @param ctx the parse tree
	 */
	void exitBal_sheet_equity(DslParser.Bal_sheet_equityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#entities}.
	 * @param ctx the parse tree
	 */
	void enterEntities(DslParser.EntitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#entities}.
	 * @param ctx the parse tree
	 */
	void exitEntities(DslParser.EntitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DslParser#main_functions}.
	 * @param ctx the parse tree
	 */
	void enterMain_functions(DslParser.Main_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DslParser#main_functions}.
	 * @param ctx the parse tree
	 */
	void exitMain_functions(DslParser.Main_functionsContext ctx);
}