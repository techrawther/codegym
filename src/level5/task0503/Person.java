package level5.task0503;

public class Person {
    String name;
    int age;
    char sex;

    public Person(){

    }
    public Person(String name, int age, char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args){

    }
}
