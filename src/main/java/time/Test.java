package time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
