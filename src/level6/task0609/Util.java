package level6.task0609;

//c = square root of [(xA-xB)^2+(yA-yB)^2]
//double Math.sqrt(double a)
public class Util {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double z = Math.sqrt(Math.pow((x2 -x1), 2) + Math.pow((y2 - y1) , 2));
        return z;
    }

    public static void main(String[] args) {

    }
}
