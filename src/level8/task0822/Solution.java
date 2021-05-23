package level8.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
1. Use the keyboard to enter the number N.
2. Read N integers and put them in a list: the getIntegerList method.
3. Find the minimum among the list items: the getMinimum method.

Requirements:
•	The program should display text on the screen.
•	The program should read values from the keyboard.
•	The Solution class must have only three methods.
•	The getIntegerList() method should read the number N from the keyboard and then return a list of N elements, which has been filled with numbers read from the keyboard.
•	The getMinimum() method must return the minimum among the list items.
•	The main() method should call the getIntegerList() method.
•	The main() method should call the getMinimum() method.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i=0; i<array.size(); i++){
                if(array.get(i) < min){
                    min = array.get(i);
                }
            }
        return min;
        }


    public static List<Integer> getIntegerList() throws IOException {
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        int count = Integer.parseInt(bufferedreader.readLine());
        // Create and initialize a list here
        List<Integer> integerlist = new ArrayList<>();
        for(int i=0;i<count;i++){
            integerlist.add(Integer.parseInt(bufferedreader.readLine()));
        }
        return integerlist;
    }
}
