package main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import antlr.antlrParser;
import antlr.antlrLexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class Main {


// code taken from https://stackoverflow.com/questions/50064110/antlr4-java-pretty-print-parse-tree-to-stdout
    // makes tree look much cleaner when printing

    public static String printSyntaxTree(Parser parser, ParseTree root) {
        StringBuilder buf = new StringBuilder();
        recursive(root, buf, 0, Arrays.asList(parser.getRuleNames()));
        return buf.toString();
    }

    private static void recursive(ParseTree aRoot, StringBuilder buf, int offset, List<String> ruleNames) {
        for (int i = 0; i < offset; i++) {
            buf.append("  ");
        }
        buf.append(Trees.getNodeText(aRoot, ruleNames)).append("\n");
        if (aRoot instanceof ParserRuleContext) {
            ParserRuleContext prc = (ParserRuleContext) aRoot;
            if (prc.children != null) {
                for (ParseTree child : prc.children) {
                    recursive(child, buf, offset + 1, ruleNames);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
	// write your code here
        antlrLexer lexer = new antlrLexer(CharStreams.fromFileName("src/main/testdata"));
        antlrParser parser = new antlrParser(new CommonTokenStream(lexer));
        ParseTree root = parser.start();
        System.out.println(printSyntaxTree(parser, root));
        //parser.start();
        System.out.println("My parser has executed Order 66");

    }
}
