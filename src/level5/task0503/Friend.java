//task0509
package level5.task0503;
public class Friend {
    String name ;
    int age;
    char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex= sex;
    }
    public static void  main(String[] args){

    }
}
