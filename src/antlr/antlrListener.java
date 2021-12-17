// Generated from /Users/chase/Desktop/4450/parproject/src/antlr.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link antlrParser}.
 */
public interface antlrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link antlrParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(antlrParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(antlrParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(antlrParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(antlrParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(antlrParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(antlrParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(antlrParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(antlrParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpression(antlrParser.ConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpression(antlrParser.ConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(antlrParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(antlrParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(antlrParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(antlrParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(antlrParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(antlrParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(antlrParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(antlrParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(antlrParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(antlrParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#expression_block}.
	 * @param ctx the parse tree
	 */
	void enterExpression_block(antlrParser.Expression_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#expression_block}.
	 * @param ctx the parse tree
	 */
	void exitExpression_block(antlrParser.Expression_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(antlrParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(antlrParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(antlrParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(antlrParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#strCast}.
	 * @param ctx the parse tree
	 */
	void enterStrCast(antlrParser.StrCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#strCast}.
	 * @param ctx the parse tree
	 */
	void exitStrCast(antlrParser.StrCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(antlrParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(antlrParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(antlrParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(antlrParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#rangeStatement}.
	 * @param ctx the parse tree
	 */
	void enterRangeStatement(antlrParser.RangeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#rangeStatement}.
	 * @param ctx the parse tree
	 */
	void exitRangeStatement(antlrParser.RangeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#rangeExp}.
	 * @param ctx the parse tree
	 */
	void enterRangeExp(antlrParser.RangeExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#rangeExp}.
	 * @param ctx the parse tree
	 */
	void exitRangeExp(antlrParser.RangeExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#intCast}.
	 * @param ctx the parse tree
	 */
	void enterIntCast(antlrParser.IntCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#intCast}.
	 * @param ctx the parse tree
	 */
	void exitIntCast(antlrParser.IntCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#ezTab}.
	 * @param ctx the parse tree
	 */
	void enterEzTab(antlrParser.EzTabContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#ezTab}.
	 * @param ctx the parse tree
	 */
	void exitEzTab(antlrParser.EzTabContext ctx);
	/**
	 * Enter a parse tree produced by {@link antlrParser#ezSpace}.
	 * @param ctx the parse tree
	 */
	void enterEzSpace(antlrParser.EzSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#ezSpace}.
	 * @param ctx the parse tree
	 */
	void exitEzSpace(antlrParser.EzSpaceContext ctx);
}