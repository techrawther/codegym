package level8.task0818;

import java.util.HashMap;
import java.util.Map;

/*
Create a Map<String, Integer> and add ten entries that represent (last name, salary) pairs.
Remove from the map all people whose salary is below 500.

Requirements:
•	The program should not display text on the screen.
•	The program should not read values from the keyboard.
•	The createMap() method must create and return a HashMap that has (String, Integer) elements and contains 10 entries that represent (last name, salary) pairs.
•	The removeItemFromMap() method must remove from the map all people whose salary is below 500.

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> salarymap = new HashMap<>();
        salarymap.put("Shah",550);
        salarymap.put("Suresh",650);
        salarymap.put("Geroge",800);
        salarymap.put("Saravana",495);
        salarymap.put("Pandiya",450);
        salarymap.put("SHairekha",450);
        salarymap.put("Praveen",700);
        salarymap.put("Ken",800);
        salarymap.put("Geroge",800);
        salarymap.put("Erik",1000);
        return salarymap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Map<String, Integer> tempmap = new HashMap<>(map);
        for (String name : tempmap.keySet()){
            if ( tempmap.get(name) <500 )
                map.remove(name);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> salarymap = createMap();
        removeItemFromMap(salarymap);
        System.out.println(salarymap);

    }
}