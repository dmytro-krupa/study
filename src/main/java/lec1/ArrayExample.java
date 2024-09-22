package lec1;

public class ArrayExample {
    public static void main(String[] args) {

        int[] test = new int[10];




        int[] a = {1,2,3};

//        System.out.println(a[3]);

//===================================================

        int size = 4;

        int[] b = new int[size];

        b[0] = 5;
        b[1] = 50;
        b[2] = 500;



        System.out.println("b[3] = " + b[3]);
        System.out.println();

//        System.out.println(b[0]);
//        System.out.println(b[1]);
//        System.out.println(b[2]);
//===================================================
        int[][] c = {
                {10},
                {20},
                {30}
        };

//        System.out.println(c[0][0]);

//===================================================
        int[][] d = {{10,2},{20},{30}};

//        System.out.println(d[1][0]);

//===================================================

        int [][] e = new int[2][];

        e[0] = new int[]{1,2,3};
        e[1] = new int[]{8};

//        System.out.println(e[0][0]);
//        System.out.println(e[0][1]);
//        System.out.println(e[0][2]);
//        System.out.println(e[1][0]);

//===================================================






    }
}
