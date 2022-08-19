package lec1;


import lec2.AccessExample;

public class SwitchExample {
    public static void main(String[] args) {

        double x = 0.4;
        System.out.println(x);

        int a = 5;

        switch (a){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("default");
        }



    }
}

