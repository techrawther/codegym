package level5.task0503;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Mean {

    public static void main(String[] args) throws Exception{
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        boolean datainput = true;
        float sum = 0;
        float counter =1;
        while(datainput){
            int number = Integer.parseInt(bufferedreader.readLine());
            if (number == -1){
                datainput=false;
                break;
            }
            else
                sum =sum + number;
            counter ++;
        }
        float avg = sum/(counter-1);
        System.out.println(avg);


    }
}
