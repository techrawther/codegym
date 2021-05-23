package level8.task0821;

import java.util.HashMap;
import java.util.Map;

/*
1. Create a Map<String, String> and add 10 people represented by (last name, first name) pairs.
2. Among these 10 people, let there be people who share the same first names.
3. Among these 10 people, let there be people who share the same last names.
4. Display the contents of the Map on the screen.

Requirements:
•	The program should display text on the screen.
•	The Solution class must have only three methods.
•	The createPeopleMap() method must create and return a Map with (String, String) elements. Also, add 10 people to the map.
•	In the createPeopleMap() method, you need to add people with the same last name.
•	In the createPeopleMap() method, you need to add people with the same first name.
•	The printPeopleMap() method should display all people in the Map. Display each value on a new line. The last name and first name should be separated by a space.
•	The main() method should call the createPeopleMap() method.
•	The main() method should call the printPeopleMap() method.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String,String> namemap = new HashMap<>();
        namemap.put("aa","bb");
        namemap.put("aa","xxx");
        namemap.put("aaa","bbb");
        namemap.put("aaaa","bbbb");
        namemap.put("cc","bbbb");
        namemap.put("cc","zzz");
        namemap.put("ddd","wwww");
        namemap.put("eeee","ffff");
        namemap.put("gggg","hhh");
        namemap.put("aaaa","dcdcdc");
        return namemap;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
