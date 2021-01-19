public class Execute extends Ex7BaseVisitor<Object> {

	@Override
    public Object visitStat(Ex7Parser.StatContext ctx) {
        if (ctx.assignment() != null)
            System.out.println(visit(ctx.assignment()));
        if (ctx.expr() != null)
            System.out.println(visit(ctx.expr()));
        return null;
    }

    @Override
    public Object visitAssignment(Ex7Parser.AssignmentContext ctx) {
        return ctx.ID() + " = " + visit(ctx.expr());
    }

    @Override
    public Object visitExprID(Ex7Parser.ExprIDContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public Object visitExprUnary(Ex7Parser.ExprUnaryContext ctx) {
        return "!" + ctx.unaryOp.getText() + " " + visit(ctx.expr());
    }

    @Override
    public Object visitExprMultDivMod(Ex7Parser.ExprMultDivModContext ctx) {
        return visit(ctx.e1) + " " + visit(ctx.e2) + " " + ctx.op.getText();
    }

    @Override
    public Object visitExprAddSub(Ex7Parser.ExprAddSubContext ctx) {
        return visit(ctx.e1) + " " + visit(ctx.e2) + " " + ctx.op.getText();
    }

    @Override
    public Object visitExprInteger(Ex7Parser.ExprIntegerContext ctx) {
        return Integer.parseInt(ctx.Integer().getText());
    }

    @Override
    public Object visitExprParent(Ex7Parser.ExprParentContext ctx) {
        return visit(ctx.expr());
    }
}
