package level7.task0706;

import javax.sql.rowset.serial.SQLInputImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Create an array of 15 integers.
2. Populate it with values from the keyboard.
3. Let the array index represent the house number. The array value at a particular index represents the number of people living in the corresponding house.
Houses with odd numbers are located on one side of the street. Those with even numbers are on the other side. Find out which side of the street has more people living on it.
4. Display the following message: "Odd-numbered houses have more residents." or "Even-numbered houses have more residents."

Note:
the house at index 0 is considered even.

Requirements:
•	The program must create an array of 15 integers.
•	The program should read numbers for the array from the keyboard.
•	The program should display "Odd-numbered houses have more residents." if the sum of odd array elements is greater than the sum of even ones.
•	The program should display "Even-numbered houses have more residents." if the sum of even array elements is greater than the sum of odd ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        int[] housenumber = new int[15];
        int evencount =0;
        int oddcount =0;
        for(int i =0;i<housenumber.length;i++){
            housenumber[i] = Integer.parseInt(bufferedreader.readLine());
        }

        for(int i =0;i<housenumber.length;i++){
            if (i==0 || i%2 ==0 )
                evencount = evencount + housenumber[i];
            else
                oddcount = oddcount + housenumber[i];
        }
        if (evencount>oddcount)
            System.out.print("Even-numbered houses have more residents.");
        else
            System.out.print("Odd-numbered houses have more residents.");
    }
}