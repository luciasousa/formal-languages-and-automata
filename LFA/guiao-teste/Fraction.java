import static java.lang.System.*;
import java.util.*;

public class Fraction {

    private int num, den;

    public Fraction(int num){
        this.num = num;
        this.den = 1;
    }
    public Fraction(int num, int den){
        this.num = num;
        this.den = den;
    }

    public Fraction add(Fraction other){
        assert other != null;
        return null;
    }

    @Override
    public String toString(){
        return num+(den == 1 ? "" : "/"+den);
    }
}