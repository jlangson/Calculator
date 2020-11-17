import java.lang.Math;

public class MagicCalculator extends Calculator{
    //find the square root
    //mathematically clunky, but good enough
    public static int squareRoot(int a){
        for(int i=0; i <= a; i++){
            if(square(i)==a){
                return i;
            }
        }
        return -1; //means no squareroot found
    }
    //find the sin
    //units radians
    public static double sin(double a){
        return Math.sin(a);
    }
    //find cosine
    //units radians
    public static double cosine(double a){
        return Math.cos(a);
    }
    //find tangent
    //units radians
    public static double tan(double a){
        return Math.tan(a);
    }
    //find factorial
    public static int factorial(int n){
        if(n<0){
            throw new RuntimeException("cannot take factorial of a negative");
        }
        else if(n==1 || n==0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

}
