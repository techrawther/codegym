package level7.task0701;

/*
1. In the initializeArray() method:
        1.1. Create an array of 20 numbers
        1.2. Read 20 numbers from the console and put them into the array
        2. The max(int[] array) method must find the maximum of the array elements
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new int[20];
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        for(int i=0;i<20;i++){
            array[i] = Integer.parseInt(bufferedreader.readLine());
        }

        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i =1;i<array.length; i++){
            if(array[i] > max)
                max=array[i];
        }
        return max;
    }
}
