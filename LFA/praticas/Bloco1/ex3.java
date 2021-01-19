import java.util.*;
import java.io.*;

public class ex3{
    public static void main(String[] args){
        Map<String, Integer> num = new HashMap<>(); 
        try{
            File f = new File("bloco1/numbers.txt");
            Scanner sf = new Scanner(f);

            while(sf.hasNextLine()){
                String line = sf.nextLine();
                String[] l = line.split(" - ");
                int n = Integer.parseInt(l[0]);
                num.put(l[1],n);
            }

            sf.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        }

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.trim().split("-| ");
        
        for(String x : s){
            try{
                x = Integer.toString(num.get(x));
                System.out.print(x+" ");
            }
            catch(NullPointerException e){
                System.out.println("Null pointer exception");
                System.exit(1);
            }
        }
        System.out.println();
    }
}