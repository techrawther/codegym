package level4;

import java.util.Scanner;

public class Lesson71 {
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);
        boolean even =false , zero = false;

        int a = scanner.nextInt();
        if (a == 0){
            zero = true;
        }
        else {
            if (a % 2 == 0){
                even = true;
            }
            else {
                 even = false;
            }
        }
        if (zero){
            System.out.print("Zero");
        }
        else if (even &&  (a>0)){
            System.out.print("Positive even number");
        }
        else if (even &&  (a<0)){
            System.out.print("Negative even number");
        }
        else if (!even &&  (a<0)){
            System.out.print("Negative odd number");
        }
        else if (!even &&  (a>0)){
            System.out.print("Positive odd number");
        }

    }
    
}
