package level7.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
String array in reverse order
        1. Create an array of 10 strings.
        2. Enter 8 strings from the keyboard and save them in the array.
        3. Display the contents of the entire array (10 elements) on the screen in reverse order. Each element on a new line.

        Requirements:
        •	The program must create an array of 10 strings.
        •	The program should read 8 strings for the array from the keyboard.
        •	The program should display 10 strings, each on a new line.
        •	The array of strings (10 elements) must be displayed in the reverse order.
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arraystring = new String[10];
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        for( int i =0 ; i<2;i++){
            arraystring[i] = bufferedreader.readLine();
        }
        for(int i = arraystring.length -1 ; i>=0; i--){
            System.out.println(arraystring[i]);
        }
    }

}
