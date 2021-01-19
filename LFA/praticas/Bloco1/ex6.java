import java.util.*;
import java.io.*;

public class ex6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		String translate = "";
		try{
			File file = new File("bloco1/dic1.txt");
			Scanner sf = new Scanner(file);
			while(sf.hasNextLine()){
				String str = sf.nextLine();
				String[] s = str.split(" ");
				map.put(s[0],s[1]);
			}
			System.out.println(map.toString());
		}
		catch(FileNotFoundException e){
			System.out.print("File not found :)");
		}
		while(true){
			String s = map.get(sc.next());
			if(translate != null){
				translate = s;
			}
			System.out.print(translate+" ");	
		}
	}
}
