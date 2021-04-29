package level6.task0602;

public class Cat {

    public static void main(String[] args){

    }
    protected void finalize(){
        System.out.println("A Cat was destroyed");
    }
}


class Dog{
    protected void finalize(){
        System.out.println("A Dog was destroyed");
    }

}