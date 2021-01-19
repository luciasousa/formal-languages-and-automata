import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
public class Ex9Main {
   public static void main(String[] args) throws Exception {
      CharStream cs = CharStreams.fromFileName("bd-1.question");
        Ex9Lexer lexer = new Ex9Lexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Ex9Parser parser = new Ex9Parser(tokens);

        ParseTree tree = parser.program();
        Interpreter visitor = new Interpreter();
        Question[] questions = (Question[]) visitor.visit(tree);

        LinkedList<Question> availableQuestions = new LinkedList<>();
        for (Question question : questions) {
            if (question.id1.equals(args[0]))
                availableQuestions.add(question);
        }
        Question selectedQuestion = availableQuestions.get((int) (Math.random() * availableQuestions.size()));
        System.out.println("- " + selectedQuestion.question);
        for (int i = 0; i < Integer.parseInt(args[2]) && i < selectedQuestion.answers.length; i++) {
            System.out.println("   " + (char) (i + 65) + ") " + selectedQuestion.answers[i]);
        }
        String answer = (new Scanner(System.in)).next();
        System.out.println(selectedQuestion.points[(int)(answer.charAt(0) - 65)]);
   }
}
