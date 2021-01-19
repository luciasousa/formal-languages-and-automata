import java.util.*;
public class Execute extends Ex5BaseVisitor<Double> {

	HashMap<String,Double> map = new HashMap<>();
   @Override public Double visitStatExpr(Ex5Parser.StatExprContext ctx) {
      Double res = visit(ctx.expr());
		if(res != null){
			System.out.println("resultado: "+res);
		}
      return res;
   }

   @Override public Double visitAssignment(Ex5Parser.AssignmentContext ctx) {
      String varName = ctx.ID().getText();
      Double value = visit(ctx.expr());
      if(value != null){
		  
		  map.put(varName,value);
		  System.out.println(varName+" = "+value);
	  }
      return value;
   }

   @Override public Double visitExprAddSub(Ex5Parser.ExprAddSubContext ctx) {
      Double op1 = visit(ctx.expr(0));
	  Double op2 = visit(ctx.expr(1));
	  Double res = null;
      if(op1 != null && op2 != null){
		  switch(ctx.op.getText()){
			  case "+":
				res = op1 + op2;
				break;
			  case "-":
				res = op1 - op2;
				break;
		  } 
	  }
      return res;
   }

   @Override public Double visitExprNum(Ex5Parser.ExprNumContext ctx) {
       return Double.parseDouble(ctx.Int().getText());
   }

   @Override public Double visitExprParent(Ex5Parser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Double visitExprUnary(Ex5Parser.ExprUnaryContext ctx) {
      Double e = visit(ctx.expr());
      Double res = null;
      if(e != null){
		  switch(ctx.op.getText()){
			  case "-":
				res = 0-e;
				break;
			  case "+":
				res = 0+e;
				break;
		  }
	  }
      return res;
   }

   @Override public Double visitExprVariable(Ex5Parser.ExprVariableContext ctx) {
      return map.get(ctx.ID().getText());
   }

   @Override public Double visitExprMultDivMod(Ex5Parser.ExprMultDivModContext ctx) {
      Double op1 = visit(ctx.expr(0));
      Double op2 = visit(ctx.expr(1));
      Double res = 0.0;
      if(op1 != null && op2 != null){
		  switch(ctx.op.getText()){
			  case "*":
				res = op1 * op2;
				break;
			  case "/":
				if(op1 != 0){
					res = op1 / op2;
				}
				break;
			  case "%":
				res = op1 % op2;
				break;
		  }
	  }
      return res;
   }
}
