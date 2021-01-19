public class Execute extends CalculatorBaseVisitor<Integer> {

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
	   System.out.println("resultado: "+visit(ctx.expr()));
      return visit(ctx.expr());
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
     int op1 = visit(ctx.expr(0));
     int op2 = visit(ctx.expr(1));
      
      switch(ctx.op.getText()){
		  case "+":
			return op1 + op2;
		  
		  case "-":
			return op1 - op2;
	  }
      return 0;
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Integer.parseInt(ctx.Integer().getText());
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      int op1 = visit(ctx.expr(0));
      int op2 = visit(ctx.expr(1));
      
      switch(ctx.op.getText()){
		  case "*":
			return op1 * op2;
		  
		  case "/":
			if(op1 != 0){
				return op1 / op2;
			}
			else{
				return 0;
			}
		  
		  case "%":
			return op1 % op2;
		  
	  }
      return 0;
   }
}
