package level7.task0711;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Create a list of strings.
2. Add 5 strings from the keyboard.
3. Do the following 13 times: remove the last string and insert it at the beginning.
4. Use a loop to display the resulting list, each value on a new line.

Requirements:
•	Declare a string list variable and immediately initialize it.
•	The program should read 5 strings from the keyboard.
•	Remove the last string and insert it at the beginning. Rinse and repeat 13 times.
•	The program should display the list, each value on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        ArrayList<String> arraylist = new ArrayList<String>();
        for(int i =0; i<5;i++){
            arraylist.add(bufferedreader.readLine());
        }
        int arraylistsize = arraylist.size();
        for(int i=0;i<13;i++){

            String temp = arraylist.get(arraylist.size() -1 );
            arraylist.remove(arraylistsize-1);
            arraylist.add(0,temp);
        }
        for(int i =0; i<arraylist.size(); i++)
            System.out.println(arraylist.get(i));

    }
}
