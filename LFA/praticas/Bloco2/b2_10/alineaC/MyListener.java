import java.util.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
public class MyListener extends Ex10cBaseListener {
   HashMap<String, Set<String>> vars = new HashMap<>();
   ParseTreeProperty<Object> ptp = new ParseTreeProperty<>();
}
