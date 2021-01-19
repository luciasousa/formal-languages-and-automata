import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.*;

public class Ex8Main {
      public static void main(String[] args) throws IOException {
        CharStream cs = CharStreams.fromFileName("p2.txt");
        Ex8Lexer lexer = new Ex8Lexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Ex8Parser parser = new Ex8Parser(tokens);

        ParseTree tree = parser.main();
        Execute visitor = new Execute();
        visitor.visit(tree);
    }
}
