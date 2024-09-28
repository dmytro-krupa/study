package lec5.old.lec5_2023;

public class ManyArgsExample {
    public static void main(String... args) {
        sum(1,2);
        sum(1,2, 3);
        sum(1,2, 3, 4);
        sum(1,2, 3, 4, 5);
    }

//    static void sum (int a, int b){
//        System.out.println(a + b);
//    }
//    static void sum (int a, int b, int c){
//        System.out.println(a + b + c);
//    }
//
//    static void sum (int a, int b, int c, int d){
//        System.out.println(a + b + c + d);
//    }

    static void sum (int... a){
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);
    }
}
