package level7.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Read 10 words from the keyboard and add them to a list of strings.
2. Determine whether the list is ordered by increasing string length.
3. If it is not, then display the index of the first element that violates this order.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        ArrayList<String> arraylist = new ArrayList<String>();
        for(int x=0; x<5; x++){
            arraylist.add(bufferedreader.readLine());
        }
        int stringlen = arraylist.get(0).length();
        for (int i = 1; i< arraylist.size(); i++){
            if(stringlen > arraylist.get(i).length()) {
                System.out.println(i);
                break;
            }
            else {
                stringlen = arraylist.get(i).length();
            }
        }

    }
}