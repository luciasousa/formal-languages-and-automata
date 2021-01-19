import java.util.*;
import java.io.*;
public class Interpreter extends ex1BaseVisitor<String> {

   @Override public String visitPrint(ex1Parser.PrintContext ctx) {
      String res = visit(ctx.expr());
      if(res != null){
         System.out.println(res);
      }
      return res;
   }

   @Override public String visitAssignment(ex1Parser.AssignmentContext ctx) {
      String res = visit(ctx.expr());
      if(res != null){
         String id = ctx.ID().getText();
         symbolTable.put(id, res);
      }
      return res;
   }

   @Override public String visitExprConcat(ex1Parser.ExprConcatContext ctx) {
      String res = null;
      String e1 = visit(ctx.expr(0));
      String e2 = visit(ctx.expr(1));
      if(e1 != null && e2 != null){
         res = e1 + e2;
      }
      return res;
   }

   @Override public String visitExprSubst(ex1Parser.ExprSubstContext ctx) {
      String res = null;
      String text = visit(ctx.expr(0));
      String pattern = visit(ctx.expr(1));
      String replace = visit(ctx.expr(2));
      if(text != null && pattern != null && replace != null){
         res = text.replaceAll(pattern, replace);
      }
      return res;
   }

   @Override public String visitExprInput(ex1Parser.ExprInputContext ctx) {
      String res = null;
      String prompt = visit(ctx.expr());
      if(prompt != null){
         System.out.print(prompt);
         res = sc.nextLine();
      }
      return res;
   }

   @Override public String visitExprString(ex1Parser.ExprStringContext ctx) {
      String res = ctx.String().getText();
      assert res.length() >= 2;
      res = res.substring(1,res.length()-1);
      return res;
   }

   @Override public String visitExprID(ex1Parser.ExprIDContext ctx) {
      String res = null;
      String id = ctx.ID().getText();
      if(!symbolTable.containsKey(id)){
         System.out.println("Oops: Variável\""+id+"\" não foi encontrada!");
      }
      else{
         res = symbolTable.get(id);
      }
      return res;
   }
   private Scanner sc = new Scanner(System.in); 
   private Map<String, String> symbolTable = new HashMap<>(); 
}
