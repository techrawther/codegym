package level7.task0703;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Create an array of 10 strings.
2. Create an array of 10 numbers.
3. Enter 10 strings from the keyboard, and put them in an array of strings.
4. In each element of the number array, record the length of the string whose string array index coincides with the current index of the number array.

Display the contents of the number array, each value on a new line.

Requirements:
•	The program must create an array of 10 strings.
•	The program must create an array of 10 integers.
•	The program should read strings for the array from the keyboard.
•	The program must record the lengths of the strings in the number array, and then display them on the screen.
 */
public class Solution {
    public  static void main(String[] args) throws IOException {
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);

        int[] intarray = new int[10];
        String[] stringarray = new String[10];
        for(int i =0 ; i<stringarray.length;i++) {
            stringarray[i] = bufferedreader.readLine();
            intarray[i] = stringarray[i].length();
        }

        for(int i =0 ; i<intarray.length;i++){
                System.out.println(intarray[i]);
            }


    }
}
