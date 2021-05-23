package level7.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Read 5 words from the keyboard and add them to a list of strings. Remove the 3rd item in the list, and then display the remaining items in reverse order.

Requirements:
•	Declare a ArrayList<String> variable and immediately initialize it.
•	Read 5 lines from the keyboard and add them to the list.
•	Remove the third element of list.
•	Display the items on the screen, each on a new line.
•	The display order must be reversed.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferereader = new BufferedReader(inputstreamreader);
        ArrayList<String> arraylist = new ArrayList<String>();
        for( int i = 0 ; i<5; i++){
            arraylist.add(bufferereader.readLine());
        }
        arraylist.remove(2);
        for( int i=arraylist.size()-1; i>=0; i--){
            System.out.println(arraylist.get(i));
        }
    }
}
