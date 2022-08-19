package lec2;

public class SimpleMethod {
    public static void main(String[] args) {
        int a = 4;

        int b = method(a);

        System.out.println(a);
        System.out.println(b);
    }

    public static int method(int a){
        a = 9;

        return a * 3;
    }


}
