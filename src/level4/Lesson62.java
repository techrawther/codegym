package level4;

import java.io.*;
import java.util.Scanner;

public class Lesson62 {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ( a< b) {
            System.out.println(a);
        }
        else if (a>b){
            System.out.println(b);            
        }
        else {
            System.out.println(a);    
        }
            
    }
}