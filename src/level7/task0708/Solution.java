package level7.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Initialize the list of strings.
2. Read 5 strings from the keyboard and add them to this list.
3. Using a loop, find the longest string in the list.
4. Display the string. If there is more than one, display each on a new line.

Requirements:
•	In the main method, initialize the Solution class's existing strings field to a new ArrayList<>.
•	The program should read 5 strings from the keyboard and write them to the list of strings.
•	The program should display the longest string.
•	If several strings qualify as the longest, then you need to display each of them on a new line.
 */

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        strings = new ArrayList<String>();
        for(int i =0; i<5; i++){
            strings.add(bufferedreader.readLine());
        }
        ArrayList<String> maxlengtharray = new ArrayList<String>();

        for(int i =0; i<strings.size(); i++){
            if (i==0){
                maxlengtharray.add(strings.get(0));
            }
            else if(strings.get(i).length() == maxlengtharray.get(0).length()){
                maxlengtharray.add(strings.get(i));
            }
            else if(strings.get(i).length() < maxlengtharray.get(0).length()){
                    continue;
            }
            else if(strings.get(i).length() > maxlengtharray.get(0).length()){
                maxlengtharray.clear();
                maxlengtharray.add(strings.get(i));
            }
        }
        for(int i=0;i<maxlengtharray.size();i++){
            System.out.println(maxlengtharray.get(i));
        }
    }
}
