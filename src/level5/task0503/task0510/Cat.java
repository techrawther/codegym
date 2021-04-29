package level5.task0503.task0510;

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;


    public void initialize(String name){
        this.name = name;
        this.age =2;
        this.weight =12;
        this.color="white";

    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age =age;
        this.weight =weight;
        this.color="white";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age =age;
        this.weight =12;
        this.color="white";
    }

    public void initialize(int weight, String color){
        this.age =2;
        this.weight = weight;
        this.color= color;
    }
    public void initialize(int weight, String color, String address){
        this.age =age;
        this.weight =weight;
        this.color = color;
        this.address= address;
    }

    public static void main(String[] args){

    }
}
