package lec3;

import java.math.BigDecimal;

public class MethodExample {
    public static void main(String[] args) {
        int[] intArray = {1,2,3};

        int[] q = intArray;

        int a = 10;
        int b = 200;

//        System.out.println("simpleMethod(int a, int b) = " + simpleMethod(a,b));
//
//        System.out.println("a = " + a);

//        System.out.println("sumOfArray(int[] array) = " + sumOfArray(intArray));
//
//        System.out.println();
//
//        for(int i : intArray){
//            System.out.println(i);
//        }

        //(A1)
        A objectA = new A();
        System.out.println(objectA.string);

        rename(objectA);

        System.out.println(objectA.string);

    }

    static int simpleMethod(int a, int b){
        int c = a + b;
        return c;
    }

    /*

    intArray -> int[3]

    intArray != array

    array -> int[1]
     */
    static int sumOfArray(int[] array){
        int c = 0;

        for(int a : array){
            c += a;
        }
//==================================

//        array = new int[1];
//
//        array[0] = 555;



        return c;
    }


    static void rename(A a){
        //a
        a = new A();
        a.string = "another string";

    }

    static class A{
        public String string = "old string";
    }


}
