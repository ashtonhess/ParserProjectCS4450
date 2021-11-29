package main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import antlr.antlrParser;
import antlr.antlrLexer;


public class Main {




    public static void main(String[] args) {
	// write your code here

        antlrLexer lexer = new antlrLexer(CharStreams.fromString("1+2+5+4-3"));
        antlrParser parser = new antlrParser(new CommonTokenStream(lexer));
        
        parser.start();
        System.out.println("My parser has executed Order 66");

    }
}
