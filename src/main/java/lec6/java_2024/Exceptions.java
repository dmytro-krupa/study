package lec6.java_2024;

import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        try {
            test();
        } catch (IOException e){
            System.out.println("inside catch");
            System.exit(0);
        } finally {
            System.out.println(4);
        }

        System.out.println("after try");
    }

    public static void test() throws IOException{
        System.out.println(1 + 2);
        throw new IOException();
    }
}
