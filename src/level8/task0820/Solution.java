package level8.task0820;

import java.util.Set;
import java.util.HashSet;

/*
1. Inside the Solution class, create public static classes Cat and Dog.
2. Implement the createCats method, which should return a set with 4 cats.
3. Implement the createDogs method, which should return a set with 3 dogs.
4. Implement the join method, which should return a combined set of all the animals (all the cats and dogs).
5. Implement the removeCats method, which should remove from the set pets all cats in the set cats.
6. Implement the printPets method, which should display all the animals in the set pets.
Each animal should be on a new line.

Requirements:
•	The program should display text on the screen.
•	There should be public static classes Cat and Dog inside the Solution class.
•	The Solution class's createCats() method must return a Set containing 4 cats.
•	The Solution class's createDogs() method must return a Set containing 3 dogs.
•	The Solution class's join() method should return a combined set of all the animals (all the cats and dogs).
•	The removeCats() method should remove from the set pets all cats in the set cats.
•	The printPets() method should display all the animals in the set pets. Each animal should be on a new line.
 */
public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogset =  new HashSet<Dog>();
        dogset.add(new Dog());
        dogset.add(new Dog());
        dogset.add(new Dog());
        return dogset;

    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> combinedset = new HashSet<Object>();
        combinedset.addAll(cats);
        combinedset.addAll(dogs);
        return combinedset;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for(Object petobject:pets){
            System.out.println(petobject);
        }
    }

    public static class Cat{

    }
    public static class Dog{

    }
}