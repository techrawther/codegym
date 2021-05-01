package level6.task0614;

/*1. In the Cat class, add the public static ArrayList<Cat> variable cats.
  2. Each time a new cat (new Cat object) is created, add it to the variable cats. Create 10 Cat objects.
  3. The printCats method should display all cats on the screen. You need to use the variable cats.

 */

import java.util.ArrayList;

public class Cat {
    public static ArrayList<Cat>  cats= new ArrayList<Cat>();

    public Cat() {
        cats.add(this);
    }

    public static void main(String[] args) {
        Cat cat1 =new Cat();
        Cat.cats.add(cat1);
        Cat cat2 =new Cat();
        Cat.cats.add(cat2);
        Cat cat3 =new Cat();
        Cat.cats.add(cat3);
        Cat cat4 =new Cat();
        Cat.cats.add(cat4);
        Cat cat5 =new Cat();
        Cat.cats.add(cat5);
        Cat cat6 =new Cat();
        Cat.cats.add(cat6);
        Cat cat7 =new Cat();
        Cat.cats.add(cat7);
        Cat cat8 =new Cat();
        Cat.cats.add(cat8);
        Cat cat9 =new Cat();
        Cat.cats.add(cat9);
        Cat cat10 =new Cat();
        Cat.cats.add(cat10);
        printCats();
    }

    public static void printCats() {
        for( Cat cats: Cat.cats){
            System.out.println(cats);
        }
    }
}
