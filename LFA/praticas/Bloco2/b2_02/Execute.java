public class Execute extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
	   System.out.println("resultado: "+visit(ctx.expr()));
      return visitChildren(ctx);
   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double op1 = visit(ctx.expr(0));
      Double op2 = visit(ctx.expr(1));
      
      switch(ctx.op.getText()){
		case("+"):
			return op1 + op2;
			
		case("-"):
			return op1 - op2;
			
		case("*"):
			return op1 * op2;
			
		case("/"):
			if(op1 != 0){
				return op1 / op2;
			}
			else{
				return 0.0;
			}
	  }
      
      return 0.0;
   }
}
