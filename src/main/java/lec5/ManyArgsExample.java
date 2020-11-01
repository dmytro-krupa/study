package lec5;

public class ManyArgsExample {
    public static void main(String[] args) {

        int[] array = {4};

//        System.out.println(sum(4, 5));
//        System.out.println(sum(2, 4, array));
        System.out.println(sum(3,2));
        System.out.println(sum(3,2, 5,7,3,2,1,-3));

    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int[] array){
        int c = a + b;

        for(int i : array){
            c += i;
        }

        return c;
    }

    public static int sum(int a, int... array){
        int c = a;

        for(int i : array){
            c += i;
        }

        return c;
    }



}

