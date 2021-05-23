package level8.task0801;

import java.util.HashSet;

/*
Create a HashSet with String elements.
        Add the following 10 strings to it:
        watermelon
        banana
        cherry
        pear
        cantaloupe
        blackberry
        ginseng
        strawberry
        iris
        potato
*/
public class Solution {
    public static void main(String[] args) throws Exception {
       HashSet<String> hashset = new HashSet<String>();
       hashset.add("watermelon");
       hashset.add("banana");
       hashset.add("cherry");
       hashset.add("pear");
       hashset.add("cantaloupe");
       hashset.add("blackberry");
       hashset.add("ginseng");
       hashset.add("strawberry");
       hashset.add("iris");
       hashset.add("potato");

       for(String iterator: hashset){
           System.out.println(iterator);
       }



    }
}