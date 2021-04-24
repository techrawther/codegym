package level4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson162 {
    public static void main(String[] args){
        int[] x = new int[3];
        Scanner scanner = new Scanner(System.in);
        for( int a=0;a<x.length; a++){
            x[a] =scanner.nextInt();

        }
        Arrays.sort(x);
        System.out.println(x[1]);
        

    }
    
}
