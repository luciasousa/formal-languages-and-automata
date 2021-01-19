import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math;

public class Execute extends Ex8BaseVisitor<Double> {

    HashMap<String, Double> vars = new HashMap<>();
    Scanner k = new Scanner(System.in);

    @Override
    public Double visitExprAssignment(Ex8Parser.ExprAssignmentContext ctx) {
        System.out.println(ctx.prompt.getText());
        return Double.parseDouble(k.nextLine());
    }

    @Override
    public Double visitExprID(Ex8Parser.ExprIDContext ctx) {
        return vars.get(ctx.ID().getText());
    }

    @Override
    public Double visitExprPrecedence2(Ex8Parser.ExprPrecedence2Context ctx) {
		Double o1 = visit(ctx.expr(0));
		Double o2 = visit(ctx.expr(1));
		switch(ctx.op2().getText()){
			case "+":
				return  o1+o2;
			case "-":
				return o1 -o2;
		}
        return null;
    }

    @Override
    public Double visitExprReduce(Ex8Parser.ExprReduceContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitExprParenthesis(Ex8Parser.ExprParenthesisContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitExprPrecedence1(Ex8Parser.ExprPrecedence1Context ctx) {
        Double o1 = visit(ctx.expr(0));
		Double o2 = visit(ctx.expr(1));
		switch(ctx.op1().getText()){
			case "*":
				return  o1*o2;
			case "/":
				return o1/o2;
			case "^":
				return Math.pow(o1,o2);
		}
        return null;
    }

    @Override
    public Double visitExprUnary(Ex8Parser.ExprUnaryContext ctx) {
		switch(ctx.op2().getText()){
			case "+":
				return 0 + visit(ctx.expr());
			case "-":
				return 0 - visit(ctx.expr());
		}
        return null;
    }


    @Override
    public Double visitFracDenNum(Ex8Parser.FracDenNumContext ctx) {
		Double a = Double.parseDouble(ctx.Number(0).getText());
		Double b = Double.parseDouble(ctx.Number(1).getText());
        return a / b;
    }

    @Override
    public Double visitFracNumber(Ex8Parser.FracNumberContext ctx) {
		Double a = Double.parseDouble(ctx.Number().getText());
        return a/1;
    }

    @Override
    public Double visitPrint(Ex8Parser.PrintContext ctx) {
        System.out.println(visit(ctx.expr()));
        return null;
    }

    @Override
    public Double visitAssignment(Ex8Parser.AssignmentContext ctx) {
        vars.put(ctx.ID().getText(), visit(ctx.expr()));
        return null;
    }
}
