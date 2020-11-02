// Generated from C:/Users/Saksham/Desktop/antlr-sample/src/main/java\Binary.g4 by ANTLR 4.8
package binary;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BinaryParser}.
 */
public interface BinaryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BinaryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BinaryParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinaryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BinaryParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BinaryParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(BinaryParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinaryParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(BinaryParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BinaryParser#binaryDigit}.
	 * @param ctx the parse tree
	 */
	void enterBinaryDigit(BinaryParser.BinaryDigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BinaryParser#binaryDigit}.
	 * @param ctx the parse tree
	 */
	void exitBinaryDigit(BinaryParser.BinaryDigitContext ctx);
}