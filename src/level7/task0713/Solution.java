package level7.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Enter 20 numbers from the keyboard, save them in a list, and then sort them to three other lists:
Numbers divisible by 3 (x%3==0), numbers divisible by 2 (x%2==0), and all other numbers.
Numbers simultaneously divisible by 3 and 2 (for example 6) go into both lists.
The order in which the lists are declared is very important.
2. The printList method should display each list item on a new line.
3. Using the printList method, display these three lists. First, the list for x%3, then the list for x%2, and then the last list.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputsteamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputsteamreader);
        ArrayList<Integer> numberlist = new ArrayList<Integer>();
        ArrayList<Integer> divisiblebytwo = new ArrayList<Integer>();
        ArrayList<Integer> divisiblebythree = new ArrayList<Integer>();
        ArrayList<Integer> mixlist = new ArrayList<Integer>();

        for(int i =0; i<5; i++){
            numberlist.add(Integer.parseInt(bufferedreader.readLine()));
        }

        for( Integer i : numberlist){
            if (i%3 == 0) divisiblebythree.add(i);
            if (i%2 == 0 ) divisiblebytwo.add(i);
            if (i%3 != 0 && i%2 != 0) mixlist.add(i);

        }
        printList(divisiblebythree);
        printList(divisiblebytwo);
        printList(mixlist);



    }

    public static void printList(List<Integer> list) {
        for(Integer i : list){
            System.out.println(i);
        }
    }
}
