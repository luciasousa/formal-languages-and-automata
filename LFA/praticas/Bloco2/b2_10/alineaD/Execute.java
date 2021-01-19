import java.util.*;
public class Execute extends Ex10dBaseVisitor<LinkedList> {

   HashMap<String,LinkedList<String>> variables = new HashMap<>();

   @Override public LinkedList<String> visitStat(Ex10dParser.StatContext ctx) {
      String s = "{";
      LinkedList<String> res = visitChildren(ctx);
      if(!res.isEmpty()){
         Iterator<String> iter = res.iterator();
         s += iter.next().toString();
         while(iter.hasNext()){
            s += "," + iter.next().toString();
         }
      }
      s += "}";
      System.out.println("result: "+s);
      return null;
   }

   @Override public LinkedList<String> visitAtrib(Ex10dParser.AtribContext ctx) {
      String name = ctx.variavel.getText();
      LinkedList<String> list = visit(ctx.conjunto());
      variables.put(name,list);
      return list;
   }

   @Override public LinkedList<String> visitIntercepcao(Ex10dParser.IntercepcaoContext ctx) {
      String one = visit(ctx.exp1).toString();
      String two = visit(ctx.exp2).toString();
      LinkedList<String> list = new LinkedList<>();
      Iterator<String> iter = one.iterator();
      while(iter.hasNext()){
         String str = iter.next().toString();
         if(two.contains(str)){
            list.add(str);
         }
      }
      return list;
   }

   @Override public LinkedList<String> visitParenteses(Ex10dParser.ParentesesContext ctx) {
      return visit(ctx.conjunto());
   }

   @Override public LinkedList<String> visitDiferenca(Ex10dParser.DiferencaContext ctx) {
      String one = visit(ctx.exp1).toString();
      String two = visit(ctx.exp2).toString();
      LinkedList<String> list = new LinkedList<>();
      Iterator<String> iter = one.iterator();
      while(iter.hasNext()){
         String str = iter.next().toString();
         if(!two.contains(str)){
            list.add(str);
         }
      }
      return list;
   }

   @Override public LinkedList<String> visitVariable(Ex10dParser.VariableContext ctx) {
      String str = ctx.variavel().getText();
      return variables.get(str);
   }

   @Override public LinkedList<String> visitUnicoGrupo(Ex10dParser.UnicoGrupoContext ctx) {
      return visit(ctx.grupo());
   }

   @Override public LinkedList<String> visitUniao(Ex10dParser.UniaoContext ctx) {
      String one = visit(ctx.exp1).toString();
      String two = visit(ctx.exp2).toString();
      LinkedList<String> list = new LinkedList<>();
      Iterator<String> iter = one.iterator();
      while(iter.hasNext()){
         String str = iter.next().toString();
         if(!list.contains(str)){
            list.add(str);
         }
      }
      iter = two.iterator();
      while(iter.hasNext()){
         String str = iter.next().toString();
         if(!list.contains(str)){
            list.add(str);
         }
      }
      return list;
   }

   @Override public LinkedList<String> visitGrupo(Ex10dParser.GrupoContext ctx) {
      return visit(ctx.sequencia());
   }

   @Override public LinkedList<String> visitSeqLetras(Ex10dParser.SeqLetrasContext ctx) {
      return visit(ctx.letra());
   }

   @Override public LinkedList<String> visitSeqInt(Ex10dParser.SeqIntContext ctx) {
      return visit(ctx.num());
   }

   @Override public LinkedList<String> visitIntSingleElem(Ex10dParser.IntSingleElemContext ctx) {
      String element = ctx.number.getText();
      LinkedList<String> toReturn = new LinkedList<>();
      toReturn.add(element);
      return toReturn;
   }

   @Override public LinkedList<String> visitIntSeveralElem(Ex10dParser.IntSeveralElemContext ctx) {
      LinkedList<String> toReturn = visit(ctx.num());
      toReturn.add(ctx.number.getText());
      return toReturn;
   }

   @Override public LinkedList<String> visitLetraSeveralElem(Ex10dParser.LetraSeveralElemContext ctx) {
      LinkedList<String> toReturn = visit(ctx.letra());
      toReturn.add(ctx.letter.getText());
      return toReturn;
   }

   @Override public LinkedList<String> visitLetraSingleElem(Ex10dParser.LetraSingleElemContext ctx) {
      
	  LinkedList<String> toReturn = new LinkedList<>();
      String elem = ctx.letter.getText();
      toReturn.add(elem);
      return toReturn;
   }
}
