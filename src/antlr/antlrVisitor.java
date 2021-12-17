// Generated from /Users/ashtonhess/Desktop/DesktopL2/DesktopL3/College/Year 3/Semester 5/CS4450 - Principles of Programming Languages/newParserProject/src/antlr.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link antlrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface antlrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link antlrParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(antlrParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(antlrParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(antlrParser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#plusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpr(antlrParser.PlusExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpression(antlrParser.ConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(antlrParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(antlrParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(antlrParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#printExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(antlrParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(antlrParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#expression_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_block(antlrParser.Expression_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(antlrParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(antlrParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#strCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrCast(antlrParser.StrCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(antlrParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(antlrParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#rangeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeStatement(antlrParser.RangeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#rangeExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExp(antlrParser.RangeExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#intCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntCast(antlrParser.IntCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#ezTab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEzTab(antlrParser.EzTabContext ctx);
	/**
	 * Visit a parse tree produced by {@link antlrParser#ezSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEzSpace(antlrParser.EzSpaceContext ctx);
}