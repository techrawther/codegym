package level6.task0604;

public class Cat {
    public static int catCount = 0;

    public Cat(){
        catCount = catCount + 1;
    }
    protected void finalize(){
        catCount = catCount -1;
    }

    public static void main(String[] args) {

    }
}