package lec5;

public class AutoboxingExample {
    public static void main(String[] args) {
        int x = 5;

        Integer bigX = x + 4;
//        Integer bigX = Integer.valueOf(x + 4);


        int z = bigX;
//        int z = bigX.intValue();


        System.out.println(bigX);


        //===================================

        long a = 5L;

        int b = (int) a;


        Long bigA = 5L;

        //can't cast
//        Integer bigB = (Integer) bigA;

        Integer bigB = bigA.intValue();




        Integer c1 = 200;
        Integer c2 = 200;

        System.out.println(c1 == c2);



    }
}
