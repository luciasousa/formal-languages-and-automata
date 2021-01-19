import java.util.*;
public class Interpreter extends Ex9BaseVisitor<Object> {
	Question[] questions;
   @Override public Object visitProgram(Ex9Parser.ProgramContext ctx) {
      questions = new Question[ctx.question().size()];
        for (int i = 0; i < ctx.question().size(); i++) {
            questions[i] = (Question) visit(ctx.question(i));
        }
        return questions;
   }

   @Override public Object visitQuestion(Ex9Parser.QuestionContext ctx) {
      String question = ctx.Text().getText().substring(1, ctx.Text().getText().length() - 1);
        String id1 = ctx.ID(0).getText();
        String[] answers = new String[ctx.options().size()];
        Integer[] points = new Integer[ctx.options().size()];
        for (int i = 0; i < ctx.options().size(); i++) {
            AnswerAndPoints aap = (AnswerAndPoints) visit(ctx.options(i));
            answers[i] = aap.answer;
            points[i] = aap.points;
        }
        return new Question(question, id1, answers, points);
   }

   @Override public Object visitOptions(Ex9Parser.OptionsContext ctx) {
      return new AnswerAndPoints(ctx.Text().getText().substring(1, ctx.Text().getText().length() - 1), Integer.parseInt(ctx.Points().getText()));
   }
	
	 class AnswerAndPoints {
        String answer;
        Integer points;

        public AnswerAndPoints(String answer, Integer points) {
            this.answer = answer;
            this.points = points;
        }
    }
}

