package level2;

//
//Set the hugeAmount variable equal to the number 100500.
//        Use the bigAmount and greatAmount variables as well as string-to-number conversion.
//        Use a single statement to declare and initialize hugeAmount.
//
//        Requirements:
//        •	Do not change the values of the bigAmount and greatAmount variables.
//        •	Use the bigAmount and greatAmount variables as well as the Integer.parseInt(String) method to initialize the hugeAmount variable.
//        •	The program must display the hugeAmount variable.

public class lesson31 {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount); //write your code here

        System.out.println(hugeAmount);
    }
}
