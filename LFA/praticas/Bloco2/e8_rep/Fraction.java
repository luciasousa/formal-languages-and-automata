
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
        Fraction res = null;
        int n = (this.num*other.den) + (other.num*this.den);
        int d = (this.den*other.den);
        res = new Fraction(n,d);
        return res;
    }

    public Fraction sub(Fraction other){
        Fraction res = null;
        int n = (this.num*other.den) - (other.num*this.den);
        int d = (this.den*other.den);
        res = new Fraction(n,d);
        return res;
    }

    public Fraction mult(Fraction other){
        Fraction res = null;
        int n = (this.num*other.num);
        int d = (this.den*other.den);
        res = new Fraction(n,d);
        return res;
    }

    public Fraction div(Fraction other){
        Fraction res = null;
        int n = (this.num*other.den);
        int d = (this.den*other.num);
        res = new Fraction(n,d);
        return res;
    }
    public Fraction pow(int pow){
        Fraction res = null;
        if(pow > 0){
            int n = (int) (Math.pow(this.num,pow));
            int d = (int) (Math.pow(this.den,pow));
            res = new Fraction(n,d);
        }
        else if(pow < 0){
            int n = (int) (Math.pow(this.den,pow));
            int d = (int) (Math.pow(this.num,pow));
            res = new Fraction(n,d);
        }
        else{
            int n = 1;
            res = new Fraction(n);
        }
        return res;
    }

    public Fraction reduce(){
        Fraction res = null;
        boolean divByTwo = (this.num%2 == 0 && this.den%2 == 0);
        boolean divByThree = (this.num%3 == 0 && this.den%3 == 0);
        while(divByTwo || divByThree){
            while(divByTwo == true){
                if(divByTwo == true){
                    int n = this.num/2;
                    int d = this.den/2;
                    res = new Fraction(n,d);
                }
                divByTwo = false;
            }
            
            while(divByThree == true){
                if(divByThree == true){
                    int n = this.num/3;
                    int d = this.den/3;
                    res = new Fraction(n,d);
                }
                divByThree = false;
            }
        }
        return res;
    }

    @Override
    public String toString(){
        return num+(den == 1 ? "" : "/"+den);
    }
}