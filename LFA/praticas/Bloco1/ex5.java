import java.util.*;
import java.io.*;

public class ex5{
	public static void main(String[] args){
		Map<String, Double> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.nextLine();
			String[] s = str.split(" ");
			double res = 0;
			
			if(str.contains("=")){
				if(s.length == 3){
					map.put(s[0],Double.parseDouble(s[2]));
				}
				else{
					if(isDouble(s[2]) && isDouble(s[4])){
						res = oper(Double.parseDouble(s[2]), s[3], Double.parseDouble(s[4]));
						map.put(s[0],res);
					}
					if(isDouble(s[2]) && !isDouble(s[4])){
						res = oper(Double.parseDouble(s[2]), s[3], map.get(s[4]));
						map.put(s[0],res);
					}
					if(!isDouble(s[2]) && isDouble(s[4])){
						res = oper(map.get(s[2]), s[3], Double.parseDouble(s[4]));
						map.put(s[0],res);
					}
					if(!isDouble(s[2]) && !isDouble(s[4])){
						res = oper(map.get(s[2]), s[3], map.get(s[4]));
						map.put(s[0],res);
					}
				}
			}
			else{
				if(isDouble(s[0]) && isDouble(s[2])){
						res = oper(Double.parseDouble(s[0]), s[1], Double.parseDouble(s[2]));
				}
				if(isDouble(s[0]) && !isDouble(s[2])){
						res = oper(Double.parseDouble(s[0]), s[1], map.get(s[2]));
				}
				if(!isDouble(s[0]) && isDouble(s[2])){
						res = oper(map.get(s[0]), s[1], Double.parseDouble(s[2]));
				}
				if(!isDouble(s[0]) && !isDouble(s[2])){
						res = oper(map.get(s[0]), s[1], map.get(s[2]));
				}
			}
			System.out.println("res = "+res);
		}
	}
	
	public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
	public static double oper(double v1, String op,double v2){
		switch(op){
			case "+":
				return v1 + v2;
				
			case "-":
				return v1 - v2;
				
			case "*":
				return v1 * v2;
				
			case "/":
				return v1 / v2;
				
			default:
				System.out.println("Operaçao invalida");
				break;
		}
		return 0;
	}
}
