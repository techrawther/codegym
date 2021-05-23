package level8.task0803;

import java.util.HashMap;
import java.util.Map;

/*
There is a Cat class with a String name.
Create a HashMap<String, Cat>.
Add 10 cats to the collection. The cat's name should be used as the key.
Display the result on the screen, each element on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"Tiger", "Missy", "Smokey", "Marmalade", "Oscar", "Snowball", "Boss", "Smudge", "Max", "Simba"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        HashMap<String, Cat> hashmapcat = new HashMap<String, Cat>();
        for (String each_cat :  cats){
            hashmapcat.put(each_cat,new Cat(each_cat));

        }
        return hashmapcat;

    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}