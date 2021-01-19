import java.util.*;
import java.io.*;

public class ex2{
    public static void main(String[] args){
        Stack pilha = new Stack();
        Scanner sc = new Scanner(System.in);
        double res = 0;
        System.out.print("$ echo: ");

        while(sc.hasNext()){
            if(sc.hasNextDouble()){
                double num = sc.nextDouble();
                pilha.push(num);
                System.out.println("Stack: "+pilha.toString());
            }
            else{
                if(pilha.size() < 2){
                    System.err.println("Stack Vazia");
                    System.exit(1);
                }
                    String op = sc.next();
                
                    double n1 = (double) pilha.pop();
                    double n2 = (double) pilha.pop();
                    switch(op){
                        
                        case "+":
                            res = n2 + n1;
                            pilha.push(res);
                            break;

                        case "-":
                            res = n2 - n1;
                            pilha.push(res);
                            break;

                        case "*":
                            res = n2 * n1;
                            pilha.push(res);
                            break;

                        case "/":
                            res = n2 / n1;
                            pilha.push(res);
                            break;

                        default:
                            System.err.println("Operando inválido");
                            System.exit(1);
                    }
                    System.out.println("Stack: "+pilha.toString());
                }
        }
    }
}