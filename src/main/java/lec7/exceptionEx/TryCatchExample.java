package lec7.exceptionEx;

import java.io.IOException;

public class TryCatchExample {
    public static void main(String[] args) {
//        int x = get();


//        try {
//            int x1 = get();
//            System.out.println("x1 = " + x1);
//        } catch (NullPointerException e){
//            System.out.println("catch block");
//        } catch (RuntimeException e){
//            System.out.println("catch block2");
//        }

        try {
            int x1 = get();
            System.out.println("x1 = " + x1);
        } catch (IOException e){
            System.out.println("catch block");
        }

    }


    static int get() throws IOException{


        if(true){
            throw new IOException();
        }



        return 5;
    }

}
