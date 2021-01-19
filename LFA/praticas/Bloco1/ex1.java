import java.util.*;
import java.io.*;

public class ex1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Operação: ");
        if(!sc.hasNextDouble()){
            System.err.println("Operando inválido");
            System.exit(1);
        }
        double num1 = sc.nextDouble();
        if(!sc.hasNext()){
            System.err.println("Operador inválido");
            System.exit(1);
        }
        String operador = sc.next();
        if(!sc.hasNextDouble()){
            System.err.println("Operando inválido");
            System.exit(1);
        }
        double num2 = sc.nextDouble();
        sc.close();

        double res = 0;

        switch(operador)
        {
            case "+":
                break;
        }
        if(operador.equals("+")){
            res = num1 + num2;
        }

        else if(operador.equals("-")){
            res = num1 - num2;
        }

        else if(operador.equals("*")){
            res = num1 * num2;
        }

        else if(operador.equals("/")){
            if(num2 == 0){
                System.err.println("Operação inválida");
                System.exit(1);
            }
            
            res = num1 / num2;
        }

        else{
            System.err.println("Operador inválido");
            System.exit(1);
        }

        System.out.println();
        System.out.printf("%3.2f %1s %3.2f = %3.2f\n",num1,operador,num2,res);
    }
}