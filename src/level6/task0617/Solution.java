package level6.task0617;

/*
1. In the Solution class, create the public static Idea class
2. In the Idea class, declare a public String getDescription() method that returns any non-empty string
3. In the Solution class, create a static public void printIdea(Idea idea) method that will display a description of the idea (what the getDescription method returns)

Requirements:
•	In the Solution class, create the public static Idea class.
•	In the Idea class, create the public String getDescription() method.
•	The getDescription method must return any non-empty string.
•	In the Solution class, create a public static void printIdea(Idea idea) method.
•	The printIdea method should display the idea description on the screen.
 */

public class Solution {
    public static class Idea{
        public String getDescription(){
            return "something";

        }
    }
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }


    public static void main(String[] args) {
        printIdea(new Idea());
    }


}


