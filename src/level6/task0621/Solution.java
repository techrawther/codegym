package level6.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Task: Each cat has a name and a mother.
Create a class that describes this situation.
Create two objects: a daughter cat and a mother.
Display them on the screen.

New task: Each cat has a name, a father, and a mother.
Edit Cat so that it reflects these relationships.
Create 6 objects: grandfather (the father's father), grandmother (the mother's mother), father, mother, son, daughter.
Display them all in the following order: grandfather, grandmother, father, mother, son, daughter.

Example input:

The cat's name is Grandfather Tiger, no mother, no father
The cat's name is Grandmother Puss, no mother, no father
The cat's name is Father Oscar, no mother, Grandfather Tiger is the father
The cat's name is Mother Missy, Grandmother Puss is the mother, no father
The cat's name is Son Simba, Mother Missy is the mother, Father Oscar is the father
The cat's name is Daughter Coco, Mother Missy is the mother, Father Oscar is the father

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandpa, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandma);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (father == null) {
                if (mother == null)
                    return "The cat's name is " + name + ", no mother, no father ";
                else
                    return "The cat's name is " + name + ", " + mother.name + " is the mother" + ", no father";
            } else {
                if (mother == null)
                    return "The cat's name is " + name + ", no mother, " + father.name + " is the father";
                else
                    return "The cat's name is " + name + ", " + mother.name + " is the mother, " + father.name + " is the father";

            }
        }
    }
}
