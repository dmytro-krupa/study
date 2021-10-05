package lec7.exceptionEx;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TryWithResExample {

    public static void main(String[] args) {


//        System.out.println(input1());
//        System.out.println(input2());
//


        try (A a = new A(); A b = new A()){
            a.read();
        } catch (IOException e){
            System.out.println("catch IOException !!!!");
        }


//
//        A a = new A();
//
//        try {
//            a.read();
//        }  finally {
//            a.close();
//        }

    }

    static class A implements AutoCloseable{

        public void read() throws IOException{
            if(true){
                throw new IOException();
            }
        }

        @Override
        public void close()  {
            System.out.println("closed");
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
