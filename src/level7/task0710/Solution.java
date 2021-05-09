package level7.task0710;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Create a list of strings in the main method.
2. Add 10 strings to it from the keyboard, but only add them to the beginning of the list, not the end.
3. Use a loop to display the contents, each value on a new line.

Requirements:
•	Declare a string list variable and immediately initialize it.
•	The program should read 10 strings from the keyboard and add them to the list.
•	The program should add lines to the beginning of the list.
•	The program should display the list, each value on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputstreamreader =  new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        ArrayList<String> arraylist = new ArrayList<String>();
        for (int i =0; i<10; i++){
            arraylist.add(0,bufferedreader.readLine());
        }
        System.out.println(arraylist);
    }
}