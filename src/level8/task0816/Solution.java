package level8.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
Create a Map<String, Date> and add ten entries that represent (last name, birth date) pairs.
Remove from the map all people born in the summer.
Hint: At CodeGym, summer lasts from June 1 to August 31.

Requirements:
•	The program should not display text on the screen.
•	The program should not read values from the keyboard.
•	The createMap() method must create and return a HashMap that has (String, Date) elements and contains 10 entries.
•	The removeAllSummerPeople() method should remove from the map all people born in the summer

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Shah", df.parse("AUGUST 1 1980"));
        map.put("Shaahha", df.parse("JANUARY 1 1980"));
        map.put("Shaahhai", df.parse("FEBRUARY 1 1980"));
        map.put("Shaahhaids", df.parse("MARCH 1 1980"));
        map.put("Shaahhaidsss", df.parse("APRIL 1 1980"));
        map.put("Shmasma", df.parse("MAY 1 1980"));
        map.put("defender", df.parse("JUNE 1 1980"));
        map.put("sporander", df.parse("JULY 1 1980"));
        map.put("sporanders", df.parse("AUGUST 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> tempmap = new HashMap<>(map);
        for( String name: tempmap.keySet()){
            Date date = tempmap.get(name);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8)
                map.remove(date);
            }
    }


    public static void main(String[] args) throws  Exception {
//        HashMap<String, Date> hashmap = createMap();
//        removeAllSummerPeople(hashmap);
    }
}