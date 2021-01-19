import java.util.HashMap;
import java.util.Scanner;

public class Interpreter extends MyGrammarBaseVisitor<String> {

   private HashMap<String, String> sy = new HashMap<>();
   Scanner sc = new Scanner(System.in);

   @Override public String visitPrint(MyGrammarParser.PrintContext ctx) {
      String res = visit(ctx.expr());
      if(res != null){
         System.out.println(res);
      }
      return res;
   }

   @Override public String visitAssignment(MyGrammarParser.AssignmentContext ctx) {
      String res = visit(ctx.expr());
      if(res != null){
         String id = ctx.ID().getText();
         sy.put(id, res);
      }
      return res;
   }

   @Override public String visitExprReplace(MyGrammarParser.ExprReplaceContext ctx) {
      String res = null;
      String e1 = visit(ctx.expr(0));
      String e2 = visit(ctx.expr(1));
      String e3 = visit(ctx.expr(2));
      if(e1 != null && e2 != null && e3 != null){
         res = e1.replaceAll(e2, e3);
      }
      return res;
   }

   @Override public String visitExprString(MyGrammarParser.ExprStringContext ctx) {
      String res = ctx.String().getText();
      assert res.length() >= 2;
      res = res.substring(1, res.length()-1);
      return res;
   }

   @Override public String visitExprConcatenate(MyGrammarParser.ExprConcatenateContext ctx) {
      String res = null;
      String e1 = visit(ctx.expr(0));
      String e2 = visit(ctx.expr(1));
      if(e1 != null && e2 != null){
         res = e1 + e2;
      }
      return res;
   }

   @Override public String visitExprInput(MyGrammarParser.ExprInputContext ctx) {
      String res = null;
      String message = visit(ctx.expr());
      if(message != null){
         System.out.print(message);
         res = sc.nextLine();
      }
      return res;
   }

   @Override public String visitExprID(MyGrammarParser.ExprIDContext ctx) {
      String res = null;
      String id = ctx.ID().getText();
      if(id != null){
         if(!sy.containsKey(id)){
            System.out.println("Variável "+id+" não existe!");
         }
         else{
            res = sy.get(id);
         }
      }
      return res;
   }
}
