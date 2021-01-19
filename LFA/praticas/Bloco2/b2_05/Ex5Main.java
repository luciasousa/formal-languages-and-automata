import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Ex5Main {
   public static void main(String[] args) throws Exception {
      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromStream(System.in);
      // create a lexer that feeds off of input CharStream:
      Ex5Lexer lexer = new Ex5Lexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      Ex5Parser parser = new Ex5Parser(tokens);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at expr rule:
      ParseTree tree = parser.expr();
      if (parser.getNumberOfSyntaxErrors() == 0) {
         // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
         Execute visitor0 = new Execute();
         visitor0.visit(tree);
      }
   }
}
