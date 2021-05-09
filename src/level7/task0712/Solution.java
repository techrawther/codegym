package level7.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Create a list of strings.
2. Add 10 strings from the keyboard.
3. Find out which string occurs earlier in the list: the shortest or the longest.
If several strings are shortest or longest, then consider the very first such string encountered.
4. Display the string described in Step 3. One string should be displayed.

Requirements:
•	Declare a string list variable and immediately initialize it.
•	The program should read 10 strings from the keyboard and add them to the list.
•	The program should display the shortest string if it comes before the longest.
•	The program should display the longest string if it comes before the shortest.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        ArrayList<String> arraylist = new ArrayList<String>();
        for(int i=0;i<10;i++){
            arraylist.add(bufferedreader.readLine());
        }
        int shortest = 0;
        int longest = 0;
        for(int i=0;i<arraylist.size();i++){
            if (arraylist.get(i).length() < arraylist.get(shortest).length())
                shortest = i;
            if (arraylist.get(i).length() > arraylist.get(longest).length())
                longest =i;

        }
        if (shortest < longest)
            System.out.println(arraylist.get(shortest));
        else
            System.out.println(arraylist.get(longest));
    }
}