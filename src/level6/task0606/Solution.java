package level6.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException, Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int input = Integer.parseInt(bufferedReader.readLine());
        //System.out.println(input);
        while(input >0 ){
            int number = input %10;
            if (number %2 == 0 ){
                Solution.even=Solution.even+1;
            }
            else{
                Solution.odd=Solution.odd+1;
            }
            input = input/10;

        }
        System.out.println("Even:  "+ Solution.even+ " Odd: " + Solution.odd);

    }
}
