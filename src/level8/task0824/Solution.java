package level8.task0824;

import java.util.ArrayList;

/*
1. Create a Human class with String name, boolean sex, int age, and ArrayList<Human> children fields.
2. Create and populate objects so that we end up with: two grandfathers, two grandmothers, one father, one mother, and three children.
3. Display all the Human objects (Hint: use the Human class's toString() method).

Requirements:
•	The program should display text on the screen.
•	The Human class must have four fields.
•	The Human class must have one method.
•	The Solution class must have one method.
•	The program should create objects and fill them with data to get two grandfathers, two grandmothers, one father, one mother, and three children. Then it should display all the Human objects on the screen.

 */
public class Solution {
    public static void main(String[] args) {
        Human man1= new Human();
        Human woman1=new Human();
        Human woman2=new Human();
        Human father1= new Human();
        father1.children.add(man1);
        father1.children.add(woman1);
        father1.children.add(woman2);
        Human grandfather1= new Human();
        grandfather1.children.add(father1.children)

    }

    public static class Human {
        String name;
        int age;
        boolean sex;
        ArrayList<Human> children = new ArrayList<Human>();


        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}