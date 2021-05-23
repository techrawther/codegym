package level8.task0814;

import java.util.HashSet;
import java.util.Set;

/*
Create a set of numbers (Set<Integer>) and add 20 different numbers to it.
Remove from the set all numbers greater than 10 .

Requirements:
•	The program should not display text on the screen.
•	The program should not read values from the keyboard.
•	The Solution class must have only three methods.
•	The createSet() method must create and return a HashSet containing 20 different numbers.
•	The removeAllNumbersGreaterThan10() method must remove from the set all numbers greater than 10.

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> hashset = new HashSet<Integer>();
        hashset.add(1);
        hashset.add(11);
        hashset.add(111);
        hashset.add(1111);
        hashset.add(111111);
        hashset.add(2);
        hashset.add(22);
        hashset.add(222);
        hashset.add(3);
        hashset.add(33);
        hashset.add(333);
        hashset.add(4);
        hashset.add(44);
        hashset.add(444);
        hashset.add(4444);
        hashset.add(44444);
        hashset.add(6);
        hashset.add(66);
        hashset.add(668);
        hashset.add(6687);
        return hashset;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        HashSet<Integer> intgtTen = new HashSet<>(set);
        for(int i: intgtTen){
            if(i>10){
                set.remove(i);
            }
        }
        return set;

    }

    public static void main(String[] args) {
    HashSet s = removeAllNumbersGreaterThan10(createSet());
    System.out.println(s);
    }
}