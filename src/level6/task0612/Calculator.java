package level6.task0612;

public class Calculator {
    public static int plus(int a, int b) {
        int z = a+ b;
        return(z);
    }

    public static int minus(int a, int b) {
        int z = a -b;
        return(z);
    }

    public static int multiply(int a, int b) {
        int z = a*b ;
        return(z);
    }

    public static double divide(int a, int b) {
        //write your code here
        double z = Double.valueOf(a)/ Double.valueOf(b);
        return(z);
    }

    public static double percent(int a, int b) {
        double z = (Double.valueOf(a) / Double.valueOf(b) * 100);
        return(z);
    }

    public static void main(String[] args) {

    }
}