package level5;


public class Cat {
    String name;
    int age;
    int weight;
    int strength;
    public Cat(){
    }
    public boolean fight(Cat somecat){
        int fight= this.age * this.weight * this.strength;
        int fightsomecat = somecat.age * somecat.weight * somecat.strength;
        //System.out.println("fight");
        //System.out.println("fightsomecat");
        if (fight < fightsomecat){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args){
        Cat cat1=new Cat();
        cat1.strength=20;
        cat1.weight=10;
        cat1.age=2;
        //System.out.print(cat1.age);
        Cat cat2 = new Cat();
        cat2.strength=30;
        cat2.weight=10;
        cat2.age=3;
        //System.out.println(cat1.fight(cat2));
        //System.out.println(cat2.fight(cat1));

    }
}
