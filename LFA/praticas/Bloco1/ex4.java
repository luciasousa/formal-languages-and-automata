import java.util.*;
import java.io.*;

public class ex4{
    public static void main(String[] args){
        Map<String, Integer> num = new HashMap<>(); 
        try{
            File f = new File("bloco1/numbers.txt");
            Scanner sf = new Scanner(f);

            while(sf.hasNextLine()){
                String line = sf.nextLine();
                String[] l = line.split(" - ");
                int nn = Integer.parseInt(l[0]);
                num.put(l[1],nn);
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
        int nb = -1;
        int res = 0;
        for(String x : s){
            try{
                int n = num.get(x);
                if(Math.log10(n) == (int) Math.log10(n)){
                    nb *= n;
                }
                else{
                    if(nb != -1){
                        res += nb;
                    }
                    nb = n;
                }
            }
            catch(NullPointerException e){
                System.out.println("Null pointer exception");
                System.exit(1);
            }
        }
        res += nb;
        System.out.println(" "+res);
    }
}