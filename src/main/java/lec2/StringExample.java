package lec2;

public class StringExample {
/*

    String є immutable

    String є final класом, тому від нього неможливо успадкуватися

 */
    public static void main(String[] args) {

//        final String s1 = "hello world";
//        System.out.println("s1 before method call: " + s1);
//
//        final String s2 = toUpperCase(s1);
//
//        System.out.println("s1 after method call: " + s1);
//        System.out.println("s2 after method call: " + s2);

//=====================================

        String a1 = "test";
        String a2 = new String("test");

//        System.out.println("a1.equals(a2) = " + a1.equals(a2));
//        System.out.println("a1==a2 = " + (a1 == a2));
//
//        System.out.println();
//        System.out.println();
//
//
//        System.out.println("a1.equals(\"test\") = " + a1.equals("test"));
//        System.out.println("a1==\"test\" = " + (a1 == "test"));
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println("a2.equals(\"test\") = " + a2.equals("test"));
//        System.out.println("a2==\"test\" = " + (a2 == "test"));



        int[] x = {1,2,3};

        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }

    }





    static String toUpperCase(String s){

        return s.toUpperCase();
    }
}
