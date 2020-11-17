public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(Calculator.add(a,b));
        System.out.println(Calculator.subtract(a,b));
        System.out.println(Calculator.multiply(a,b));
        System.out.println(Calculator.divide(a,b));
        System.out.println(Calculator.square(a));

        int c = 25;
        System.out.println("time for magic");
        System.out.println(MagicCalculator.squareRoot(c));
        System.out.println(MagicCalculator.sin(0));
        System.out.println(MagicCalculator.cosine(0));
        System.out.println(MagicCalculator.tan(180));
        System.out.println(MagicCalculator.factorial(5));
        System.out.println(MagicCalculator.factorial(0));
        System.out.println(MagicCalculator.factorial(1));
        System.out.println(MagicCalculator.factorial(2));
    }
}
