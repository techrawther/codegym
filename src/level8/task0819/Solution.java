package level8.task0819;

import java.util.HashSet;
import java.util.Set;

/*
1. Inside the Solution class, create a public static Cat class.
2. Implement the createCats method. It must create a Set of cats and add 3 cats to it.
3. In the main method, remove one cat from Set cats.
4. Implement the printCats method. It should display all the cats that remain in the set.
Each cat on a new line.

Requirements:
•	The program should display text on the screen.
•	Inside the Solution class, there must be a public static Cat class with a default constructor.
•	The Solution class's createCats() method must return a Set containing 3 cats.
•	The Solution class's printCats() method must display all the cats in the set. Each cat on a new line.
•	The main() method should call the createCats() method once.
•	The main() method should call the printCats() method.
•	The main() method must remove one cat from the set of cats.

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        printCats(cats);
        cats.remove(cats.toArray()[0]);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> catset = new HashSet<Cat>();
        catset.add(new Cat());
        catset.add(new Cat());
        catset.add(new Cat());
        return catset;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat eachCat:cats)
            System.out.println(eachCat);
    }

    public static class Cat {
        String catname;

    }
}

