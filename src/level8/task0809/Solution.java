package level8.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Measure how long it takes to perform 10,000 insertions on each list.
The getInsertTimeInMs method must return its execution time in milliseconds.

Requirements:
•	The program should display numbers on the screen.
•	The main method should call the getInsertTimeInMs method only twice.
•	The insert10000(List list) method must insert 10,000 items into the list.
•	The getInsertTimeInMs method should call the insert10000 method only once.
•	The getInsertTimeInMs method should return the time (in milliseconds) that it takes to perform 10,000 insertions on the list

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date datenow = new Date();
        long now = datenow.getTime();
        insert10000(list);
        Date  dateafter = new Date();
        long after=dateafter.getTime();
        return(after - now);


    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
