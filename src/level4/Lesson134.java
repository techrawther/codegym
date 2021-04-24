package level4;

import java.util.Scanner;

public class Lesson134 {
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int x=0; x<m; x++){
            for(int y=0; y<n; y++){
                System.out.print("8");                
            }            
            System.out.println();
        }
    }
    
}
