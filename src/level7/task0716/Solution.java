package level7.task0716;

import java.sql.Array;
import java.util.ArrayList;

/*
1. Create a list of words and populate it yourself.
2. The fix method should:
2.1. remove all words containing the letter "r" from the list
2.2. duplicate all words containing the letter "l".
2.3. if a word contains both "r" and "l", then leave it unchanged.
2.4. don't do anything to other words.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here
        ArrayList<String> newlist= new ArrayList<String>();
        for(String s: list){
            if(s.contains("r") && s.contains("l")) newlist.add(s);
            else if(s.contains("r")) continue;
            else if(s.contains("l")){
                newlist.add(s);
                newlist.add(s);
            }
            else newlist.add(s);
        }
        return(newlist);
    }
}