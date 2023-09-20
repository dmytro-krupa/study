package lec1;

public class OpExample {
    public static void main(String[] args) {
        int a = 5;
//замінити на int для цілочисельної арифметики
        int b = 2;
//
//        System.out.println("a + b = " + (a + b));
//        System.out.println("a - b = " + (a - b));
//        System.out.println("a / b = " + (a / b));
//        System.out.println("a * b = " + (a * b));
//        System.out.println("a % b = " + (a % b));


        //=====================================


        int q = 5;
//
//        System.out.println("++q " + (--q));
//        System.out.println("q++ " + (q--));


        //=====================================

        int x;

        boolean t = true;
        boolean f = false;

        System.out.println(t | f);
        System.out.println("======");

        int z = 44+22;

        System.out.println(true1() | false1());
        System.out.println("======");
        System.out.println(true1() || false1());
        System.out.println("======");
        System.out.println("======");
        System.out.println(a | b); //побітова операція

        // &    |

        // && i || - скорочені логічні оператори. Якщо результат ясний - пришвидшують роботу програми


        boolean isRain = false;
        boolean isHot = true;
        boolean isSun = false;

        boolean isRainingNow = isRain && !isSun && isHot;

        if (isRainingNow) {
            System.out.println("Дощить !!!");
        } else {
//            System.out.println("Хороша погода !!!");
        }


        if (isRainingNow) {
            System.out.println("Дощить !!!");
        } else if (true) {

        } else {
            int y = 4;
        }


    }

    static boolean true1() {
        System.out.println("true1");
        return true;
    }


    static boolean false1() {
        System.out.println("false1");
        return false;
    }
}

