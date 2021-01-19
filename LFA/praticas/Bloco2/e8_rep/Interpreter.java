import java.util.*;

public class Interpreter extends MyGrammarBaseVisitor<Object> {

   private HashMap<String, Fraction> sy = new HashMap<>();
   
   @Override public Object visitPrint(MyGrammarParser.PrintContext ctx) {
      Fraction res = (Fraction) visit(ctx.expr());
      if(res != null){
         System.out.println(res.toString());
      }
      return res;
   }

   @Override public Object visitAssignment(MyGrammarParser.AssignmentContext ctx) {
      Fraction res = (Fraction) visit(ctx.expr());
      if(res != null){
         String id = ctx.ID().getText();
         sy.put(id,res);
      }
      return res;
   }

   @Override public Object visitExprFrac(MyGrammarParser.ExprFracContext ctx) {
      Fraction res = null;
      String n = ctx.NUM(0).getText();
      String d = ctx.NUM(1).getText();
      if(n != null && d != null){
         res = new Fraction(Integer.parseInt(n), Integer.parseInt(d));
      }
      return res;
   }

   @Override public Object visitExprAddSub(MyGrammarParser.ExprAddSubContext ctx) {
      Fraction res = null;
      Fraction f1 = (Fraction) visit(ctx.expr(0));
      Fraction f2 = (Fraction) visit(ctx.expr(1));
      String o = ctx.op.getText();
      switch(o){
         case "+":
            res = f1.add(f2);

         case "-":
            res = f1.sub(f2);
      }
      return res;
   }

   @Override public Object visitExprPow(MyGrammarParser.ExprPowContext ctx) {
      Fraction res = null;
      Fraction f1 = (Fraction) visit(ctx.expr(0));
      int p = (int) visit(ctx.expr(1));
      res = f1.pow(p);
      return res;
   }

   @Override public Object visitExprNum(MyGrammarParser.ExprNumContext ctx) {
      Fraction res = null;
      String n = ctx.NUM().getText();
      if(n != null){
         res = new Fraction(Integer.parseInt(n));
      }
      return res;
   }

   @Override public Object visitExprMultDiv(MyGrammarParser.ExprMultDivContext ctx) {
      Fraction res = null;
      Fraction f1 = (Fraction) visit(ctx.expr(0));
      Fraction f2 = (Fraction) visit(ctx.expr(1));
      String op = ctx.op.getText();
      switch(op){
         case "*":
            res = f1.mult(f2);

         case ":":
            res = f1.div(f2);
      }
      return res;
   }

   @Override public Object visitExprRed(MyGrammarParser.ExprRedContext ctx) {
      Fraction res = null;
      Fraction f1 = (Fraction) visit(ctx.expr());
      res = f1.reduce();
      return res;
   }

   @Override public Object visitExprID(MyGrammarParser.ExprIDContext ctx) {
      Fraction res = null;
      String id = ctx.ID().getText();
      if(!sy.containsKey(id)){
         System.out.println("Oops: Variável\""+id+"\" não foi encontrada!");
      }
      else{
         res = sy.get(id);
      }
      return res;
   }
}


