package lec7.exceptionEx;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResExample {

    public static void main(String[] args) {

//        System.out.println(input1());
        System.out.println(input2());
//
        try (A a = new A()){

        }

    }

    static class A implements Closeable{
        @Override
        public void close()  {

        }
    }


    public static String input1()  {
        String s = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return s;
    }



    public static String input2()  {
        String s = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                reader.close();
            } catch (IOException e1){
                System.out.println("Reader can't be closed");
            }
        }

        return s;
    }
}
