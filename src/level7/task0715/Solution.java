package level7.task0715;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
       List<String> arraylist = new ArrayList<String>();
       arraylist.add("Sam");
       arraylist.add("I");
       arraylist.add("Am");
       ArrayList<String> mergelist = new ArrayList<String>();
       for (String s : arraylist)
           mergelist.add(s + "Ham");
       for (String s : mergelist)
           System.out.println(s);

    }
}
