package lec2.lec2024;

public class ScopeEx {
    public static void main(String[] args) {


        int x;

        if (true) {
            x = 4;
        } else {
            x = 6;
        }

        System.out.println("x = " + x);

    }
}
