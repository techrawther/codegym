package level8.task0815;
import java.util.HashMap;
import java.util.HashSet;

/*
Create a Map<String, String> and add ten entries that represent (last name, first name) pairs.
Check how many people have the same first name or last name.

Requirements:
•	The program should not display text on the screen.
•	The program should not read values from the keyboard.
•	The createMap() method must create and return a HashMap that has (String, String) elements and contains 10 entries that represent (last name, first name) pairs.
•	The getSameFirstNameCount() method must return the number of people whose first name is the same as the name parameter.
•	The getSameLastNameCount() method must return the number of people whose last name is the same as the lastName parameter.

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> hashmap = new HashMap<String,String>();
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

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        int count=0;
        System.out.println(map.keySet());
        for (String firstname:map.keySet()){
            if(firstname.equals(name)){
                count = count +1;
            }
        }
        return count;

    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count=0;
        for (String lname:map.values() ){
            if(lname.equals(lastName)){
                count = count +1;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap=  createMap();
        int firstname= getSameFirstNameCount(hashmap,"Anoop");
    }
}
