import java.util.ArrayList;
import java.util.HashMap;

public class Execute extends JavaParserBaseVisitor<Object> {
    public HashMap<String, ArrayList<String>> connections = new HashMap<>();
    private String currentMethodName;

    @Override
    public Object visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        currentMethodName = ctx.IDENTIFIER().getText();
        connections.put(currentMethodName, new ArrayList<>());
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodCall(JavaParser.MethodCallContext ctx) {
        if(currentMethodName == null || ctx.IDENTIFIER() == null) return null;
        connections.get(currentMethodName).add(ctx.IDENTIFIER().getText());
        return super.visitMethodCall(ctx);
    }
}
