package level8.task0812;

import java.io.*;
import java.util.ArrayList;
/*
1. Create a list of numbers.
2. Use the keyboard to add 10 numbers to the list.
3. Display the length of the longest sequence of repeating numbers in the list.

Example for the list 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

The value is 3, because the longest sequence of repeating numbers is three fours.

Requirements:
•	The program must display a number on the screen.
•	The program should read values from the keyboard.
•	In the main method, declare an ArrayList variable with Integer elements and immediately initialize it.
•	The program should add 10 numbers to the collection in accordance with the conditions.
•	The program should display the length of the longest sequence of repeating numbers in the list.
 */
public class Solution {
    public static void main(String[] args) throws  Exception{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i =0; i<10; i++){
            arrayList.add(i,Integer.parseInt(bufferedReader.readLine()));
        }
        int maxoccurance =1;
        int occuranceinside=1;
        int check = 0;
        for (int i =1; i<=arrayList.size(); i ++){
            if (arrayList.get(i)== arrayList.get(i-1)){
                occuranceinside  = occuranceinside  +1;

            }
            else {
                if(occuranceinside >maxoccurance) {
                    maxoccurance = occuranceinside;
                    check = arrayList.get(i-1);
                }
                occuranceinside=1;
            }
        }
        System.out.println(maxoccurance);
        System.out.println(check);


    }
}
