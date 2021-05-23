package level8.task0817;

import java.util.HashMap;
import java.util.Map;

/*
Create a Map<String, String> and add ten entries that represent (last name, first name) pairs.
Remove people with the same first name.

Requirements:
•	The program should not display text on the screen.
•	The program should not read values from the keyboard.
•	The createMap() method must create and return a HashMap that has (String, String) elements and contains 10 entries.
•	The removeFirstNameDuplicates() method must remove from the map all people who have the same first name.
•	The removeFirstNameDuplicates() method must call the removeItemFromMapByValue() method.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("Shahinshah","Rawther");
        hashmap.put("Sumayyah","Rawther");
        hashmap.put("Samih","Rawther");
        hashmap.put("Shahinshah","Nair");
        hashmap.put("Anoop","Nair");
        hashmap.put("Anoop","Joseph");
        hashmap.put("Skaria","Joseph");
        hashmap.put("Pradeep","Nair");
        hashmap.put("Pradeep","Varma");
        hashmap.put("Asuthosh","Varma");
        return hashmap;

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        for (String firstname: map.keySet())
            removeItemFromMapByValue(map, firstname);

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap =  createMap();
        removeFirstNameDuplicates(hashmap);
        System.out.print(hashmap);


    }
}

/*
        HashMap<String, String> copy = new HashMap<>(map);

        for (String name : copy.values()) {
            int count = 0;
            for (String _name : map.values()) {
                if (_name.equals(name)) count++;
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
 */