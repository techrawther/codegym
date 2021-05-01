package level6.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
ConsoleReader class

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputStreamReader);
        return(bufferedreader.readLine());

    }

    public static int readInt() throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputStreamReader);
        return(Integer.parseInt(bufferedreader.readLine()));


    }

    public static double readDouble() throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputStreamReader);
        return(Double.parseDouble(bufferedreader.readLine()));


    }

    public static boolean readBoolean() throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputStreamReader);
        return(Boolean.parseBoolean(bufferedreader.readLine()));

    }

    public static void main(String[] args) {

    }
}
