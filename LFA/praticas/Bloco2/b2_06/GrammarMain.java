import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class GrammarMain {
    public static void main(String[] args) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        JavaLexer lexer = new JavaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);

        ParseTree tree = parser.compilationUnit();
        Execute visitor = new Execute();
        visitor.visit(tree);

        System.out.println("digraph G {\n" +
                "  ranksep=.25;\n" +
                "  edge [arrowsize=.5]\n" +
                "  node [shape=circle, fontname=\"ArialNarrow\",\n" +
                "  fontsize=12, fixedsize=true, height=.45];");

        for (String key : visitor.connections.keySet()) {
            System.out.printf(key + ";");
        }
        System.out.println();
        for (String key : visitor.connections.keySet()) {
            for (String item : visitor.connections.get(key)) {
                System.out.println("  " + key + " -> " + item + ";");
            }
        }
        System.out.println("}");

    }
}
