package level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lesson164 {
    public static void main(String[] args) throws Exception{        
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
        String name = bufferedreader.readLine();
        System.out.println(name);        
        int month =Integer.parseInt(bufferedreader.readLine());
        int date = Integer.parseInt(bufferedreader.readLine());
        int year = Integer.parseInt(bufferedreader.readLine());
        String output = "My name is" + name + " .\nI was born on " + month + "/" + date+ "/" + year;
        System.out.println(output);
    }
    
}
