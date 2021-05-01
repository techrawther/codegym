package level6.task0616;
/*
Place the minimum number of static modifiers necessary to make the code start working and the program complete successfully.

        Requirements:
        •	Don't change the method implementations or access modifiers.
        •	Add static modifiers in the required locations.
        •	The program must have only 4 static modifiers.
        •	The program should display text on the screen.
*/
public class Solution {
    public static int step;

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        new Solution().method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1)
            return;
        main(null);
    }
}
