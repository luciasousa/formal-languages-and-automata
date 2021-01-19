import java.util.*;

public class MyListener extends Ex10bBaseListener {

   HashMap<String, Set<String>> vars = new HashMap<>();

   @Override public void exitStat(Ex10bParser.StatContext ctx) {
      if (ctx.assignment() != null) System.out.println(ctx.assignment().s);
      if (ctx.expr() != null) System.out.println(ctx.expr().s);
   }

   @Override public void exitAssignment(Ex10bParser.AssignmentContext ctx) {
      vars.put(ctx.ID().getText(), ctx.expr().s);
      ctx.s = ctx.expr().s;
   }

   @Override public void exitExprJoin(Ex10bParser.ExprJoinContext ctx) {
      Set<String> s1 = ctx.e1.s;
      Set<String> s2 = ctx.e2.s;
      s1.retainAll(s2);
      ctx.s = s1;
   }

   @Override public void exitExprParenthesis(Ex10bParser.ExprParenthesisContext ctx) {
      ctx.s = ctx.expr().s;
   }

   @Override public void exitExprId(Ex10bParser.ExprIdContext ctx) {
      ctx.s = vars.get(ctx.ID().getText());
   }

   @Override public void exitExprAdd(Ex10bParser.ExprAddContext ctx) {
      Set<String> s1 = ctx.e1.s;
      Set<String> s2 = ctx.e2.s;
      s1.addAll(s2);
      ctx.s = s1;
   }

   @Override public void exitExprSet(Ex10bParser.ExprSetContext ctx) {
      ctx.s = ctx.set().s;
   }

   @Override public void exitExprExcept(Ex10bParser.ExprExceptContext ctx) {
      Set<String> s1 = ctx.e1.s;
      Set<String> s2 = ctx.e2.s;
      s1.removeAll(s2);
      ctx.s = s1;
   }

   @Override public void exitSet(Ex10bParser.SetContext ctx) {
      Set<String> set = new HashSet();
      for (Ex10bParser.ItemContext itemContext : ctx.item()) {
         set.add(itemContext.getText());
      }
      ctx.s = set;
   }

}
