import java.util.HashMap;

public class Execute extends Ex4BaseListener {

	private HashMap<Integer,String> map = new HashMap<>();
	
	@Override public void exitLine(Ex4Parser.LineContext ctx) {
		map.put(Integer.valueOf(ctx.Num().getText()),ctx.Word().getText());
	}
}
