// Generated from /Users/ashtonhess/Desktop/DesktopL2/DesktopL3/College/Year 3/Semester 5/CS4450 - Principles of Programming Languages/ParserProject/src/antlr.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by {@link antlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(antlrParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link antlrParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(antlrParser.ExpressionContext ctx);
}