package level7.task0707;

import java.util.ArrayList;

/*
What sort of list is that?

*/



public class Solution {
        public static void main(String[] args) throws Exception {
            ArrayList<String> arraylist = new ArrayList<String>();
            arraylist.add("Shibila");
            arraylist.add("Samih");
            arraylist.add("Sumayyah");
            arraylist.add("Samih");
            arraylist.add("Rawther");
            System.out.println(arraylist.size());
            for(int i =0; i< arraylist.size(); i++){
                System.out.println(arraylist.get(i));
            }
        }
    }



