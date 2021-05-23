package level8.task0813;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

/*
20 words that start with the letter "L"

*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<String>();
        set.add("Lion");
        set.add("Ldsfds");
        set.add("Ldsfdssdfds");
        set.add("Ldsfdsf");
        set.add("Ldsfdsg");
        set.add("Ldsfdsh");
        set.add("Ldsfdsj");
        set.add("Ldsfdsk");
        set.add("Ldsfdsl");
        set.add("Ldsfdsn");
        set.add("Ldsfdsx");
        set.add("Ldsfdsd");
        set.add("Ldsfdsr");
        set.add("Ldsfdst");
        set.add("Ldsfdsdf");
        set.add("Ldsfdsdfg");
        set.add("Ldsfdsdfgsdfds");
        set.add("Ldsfdsdfgdf");
        set.add("Ldsfdsdfgdfg");
        set.add("Ldsfdsdfgdfgsdf");
        return set;


    }

        public static void main(String[] args){
        Set s = createSet();
        System.out.println(s);
        System.out.println(s.size());

        }


}
