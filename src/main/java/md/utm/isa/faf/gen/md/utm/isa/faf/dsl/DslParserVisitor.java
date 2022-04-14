// Generated from D:/EGOR/Projects/FinSL/FinSL/src/main/java/md/utm/isa/faf/dsl\DslParser.g4 by ANTLR 4.9.2
package md.utm.isa.faf.gen.md.utm.isa.faf.dsl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DslParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DslParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DslParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DslParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(DslParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#funDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDecl(DslParser.FunDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(DslParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#finDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinDecl(DslParser.FinDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#balanceSheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanceSheet(DslParser.BalanceSheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#incomeState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncomeState(DslParser.IncomeStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#bal_assets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBal_assets(DslParser.Bal_assetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#bal_liab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBal_liab(DslParser.Bal_liabContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#bal_equity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBal_equity(DslParser.Bal_equityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#asset_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsset_ex(DslParser.Asset_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#liab_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiab_ex(DslParser.Liab_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#equity_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquity_ex(DslParser.Equity_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DslParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(DslParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(DslParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(DslParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(DslParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(DslParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DslParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DslParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DslParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#logic_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_or(DslParser.Logic_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#logic_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_and(DslParser.Logic_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(DslParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(DslParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(DslParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DslParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(DslParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(DslParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(DslParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DslParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(DslParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(DslParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#bal_sheet_assets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBal_sheet_assets(DslParser.Bal_sheet_assetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#bal_sheet_liab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBal_sheet_liab(DslParser.Bal_sheet_liabContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#bal_sheet_equity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBal_sheet_equity(DslParser.Bal_sheet_equityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DslParser#entities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntities(DslParser.EntitiesContext ctx);
}