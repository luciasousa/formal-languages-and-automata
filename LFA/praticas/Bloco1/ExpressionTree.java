import java.util.*;
import java.lang.*;

public class ExpressionTree{
	
	private static class Node{
		String element;
		Node left;
		Node right;
		
		Node(String elem){
			this.element = elem;
			left = right = null;
		}
	}
	
	private Node root;
	
	public ExpressionTree(){
		
	}
	
	public void insert(String s){
		Scanner sc = new Scanner(s);
		root = insert(sc, root);
		if(sc.hasNext()){
			throw new IllegalArgumentException();
		}
	}
	
	private Node insert(Scanner sc, Node n){
		if(!sc.hasNextDouble()){
			n = new Node(sc.next());
			n.left = insert(sc, n.left);
			n.right = insert(sc, n.right);
		}
		else{
			n = new Node(sc.next());
		}
		return n;
	}
	
	public String printInfix(){
       if(root == null){
		   throw new NullPointerException();
	   }
       return printInfix(root);
    }

    private String printInfix(Node node) {
        if(node.right == null || node.left == null){
			return node.element;
		}
        return printInfix(node.left) + " " + node.element + " " + printInfix(node.right);
    }

    public Double eval(){
        if(root == null){
			throw new NullPointerException();
		}
        return eval(root);
    }

    private Double eval(Node node){
        if(node.right == null || node.left == null){
			return Double.parseDouble(node.element);
		}

        double op1 = eval(node.left);
        double op2 = eval(node.right);
        Double result = null;
        switch (node.element) {
            case "+":
                result = op1 + op2;
                break;
            case "-":
                result = op1 - op2;
                break;
            case "*":
                result = op1 * op2;
                break;
            case "/":
                result = op1 / op2;
                break;
            default:
                break;
        }
        return result;
    }
}
