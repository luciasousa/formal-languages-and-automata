import java.util.*;
import java.io.*;

public class ex6c{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		String meaning = "";
		try{
			File file = new File("bloco1/dic2.txt");
			Scanner sf = new Scanner(file);
			while(sf.hasNextLine()){
				String str = sf.nextLine();
				String[] s = str.split("\t");
				map.put(s[0],s[1]);
			}
			System.out.println(map.toString());
		}
		catch(FileNotFoundException e){
			System.out.print("File not found :)");
		}
		boolean trocou = true;
		while(trocou){
			trocou = false;
			String s = map.get(sc.next());
			if(meaning != null){
				trocou = true;
				meaning = s;
			}
			System.out.print(meaning+" ");	
		}
	}
}

