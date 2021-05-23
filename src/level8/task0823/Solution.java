package level8.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Write a program that reads a string from the keyboard.
The program should change the first letter of each word to uppercase.
Display the result on the screen.

Example input:
sam i am.

Example output:
Sam I Am.

Requirements:
•	The program should display text on the screen.
•	The program should read a string from the keyboard.
•	The program should change the first letter of each word to uppercase

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuffer sb = new StringBuffer();
        char[] chararray  = s.toCharArray();
        for(int i=0;i< chararray.length;i++){
            if(i==0 || chararray[i-1] == ' ' ){
                sb.append(Character.toUpperCase(chararray[i]));
            }
            else
                sb.append(chararray[i]);
            }
        System.out.println(sb);

        }

}