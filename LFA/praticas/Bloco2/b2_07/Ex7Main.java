import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Ex7Main {
   public static void main(String[] args) throws IOException {
        CharStream cs = CharStreams.fromFileName("p1.txt");
        Ex7Lexer lexer = new Ex7Lexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Ex7Parser parser = new Ex7Parser(tokens);

        ParseTree tree = parser.program();
        Execute visitor = new Execute();
        visitor.visit(tree);
    }
}
