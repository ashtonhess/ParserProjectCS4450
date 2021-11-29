// Generated from /Users/ashtonhess/Desktop/DesktopL2/DesktopL3/College/Year 3/Semester 5/CS4450 - Principles of Programming Languages/ParserProject/src/antlr.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by {@link antlrParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(antlrParser.ExpressionContext ctx);
}