package time.old;

import java.io.Serializable;

public class Test implements Serializable {
    static String str = "Team 1";

    static void change(int a){a = 10;}
    static void change(String str){Test.str = "Team 2";}

    public static void main(String[] args) {
        int a = 5;
        change(a);
        change(str);
        System.out.println(str + " " + a);

    }

}
