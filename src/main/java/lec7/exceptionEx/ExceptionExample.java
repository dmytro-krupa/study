package lec7.exceptionEx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionExample {

    public static void main(String[] args) {
//        A a = null;
//
//
//        a.hashCode();


//        List<Integer> list = new ArrayList<>();

//        list.add(1);
//        list.get(45);

        int x;


        try {
            x = io();
        }
        catch (IOException | ClassNotFoundException e) {
            x = 1;
            System.out.println("Used default value for x");
        }
        catch (Exception e){
            x= 10;
        } finally {
            System.out.println("TEST");
        }


        System.out.println(x);
    }


    public static int io() throws IOException, ClassNotFoundException{
//        A a = null;

//        a.hashCode();


            if(true){
                throw new IOException();
            }




        System.out.println("bla-bla");

            return 0;
    }

    static class A {
    }
}
