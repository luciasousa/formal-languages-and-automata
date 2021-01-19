import java.util.*;
import java.lang.*;

public class ex7{
	public static void main(String[] args){
		ExpressionTree et = new ExpressionTree();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			try{
				System.out.print("\nExpression: ");
				et.insert(sc.nextLine());
				System.out.println("Infix: "+et.printInfix());
				System.out.println("Result: "+et.eval());
			}
			catch(Exception e){
				System.out.println("Expressão inválida :)");
			}
		}
	}
}
