package level8.task0802;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.HashMap;
import java.util.Map;
/*
Create a HashMap<String, String>, and add 10 string pairs:
        watermelon - melon,
        banana - fruit,
        cherry - fruit,
        pear - fruit,
        cantaloupe - melon,
        blackberry - fruit,
        ginseng - root,
        strawberry - fruit,
        iris - flower,
        potato - tuber.
        Display the contents of the collection, each element on a new line.

        Example output: (here we just show one line):
        potato - tuber
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String,String> hashmap = new HashMap<String,String>();
        hashmap.put("watermelon","melon");
        hashmap.put("banana","fruit");
        hashmap.put("cherry","fruit");
        hashmap.put("pear","fruit");
        hashmap.put("cantaloupe","melon");
        hashmap.put("blackberry","fruit");
        hashmap.put("ginseng","root");
        hashmap.put("strawberry","fruit");
        hashmap.put("iris","flower");
        hashmap.put("potato","tuber");

        for(String x: hashmap.keySet()){
            System.out.println(x + "\t-\t" + hashmap.get(x));
        }
    }
}
