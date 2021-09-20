package lec2;

public class SimpleMethod {
    public static void main(String[] args) {
        int a = 4;
//        int b = 9;

//        System.out.println(method(a));
//        System.out.println(a);
//        System.out.println(b);


        int b = method(a);

        System.out.println(b);
        System.out.println(a);
    }

    public static int method(int x){

        x = 9;

        return x * 3;
    }
}
