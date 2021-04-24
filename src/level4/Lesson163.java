package level4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lesson163 {
    public static void main(String[] args) throws Exception{
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        boolean end = false;
        int sum = 0;
        while(!end){
            int x = Integer.parseInt(bufferedreader.readLine());
            if (x==-1){
                end = true;
                System.out.println(end);
            }
            sum = sum +x;            
        }
        System.out.println(sum);

    }
    
}
