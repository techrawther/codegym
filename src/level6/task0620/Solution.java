package level6.task0620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Task: The program takes two numbers from the keyboard and displays the maximum using a phrase like "The max is 25".

Requirements:
•	The program must read data from the keyboard.
•	The program should display the result on the screen.
•	The displayed text should start with "The max is".
•	The displayed text should end with the maximum of the 2 entered numbers.

*/

public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        Solution.max = a > b ? a : b;

        System.out.println(max + Solution.max);
    }

}
