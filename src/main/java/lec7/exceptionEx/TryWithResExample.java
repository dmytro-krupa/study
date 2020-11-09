package lec7.exceptionEx;

import java.io.Closeable;
import java.io.IOException;

public class TryWithResExample {

    public static void main(String[] args) {

        try (A a = new A()){

        }

    }

    static class A implements AutoCloseable{
        @Override
        public void close()  {

        }
    }

}
