package lec7.exceptionEx.exceptions_2023;

import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int a;
            int b;

            try {
                a = getRandomNumber();
                b = getRandomNumber();
            } catch (RandomGeneratedException | IOException e) {
                System.out.println("Exception occurred: " + e.getMessage());
                System.out.println("Used number 15 instead");
                b = 15;
                a = 10;
            } catch (Exception e){
                throw new IllegalStateException();
            } finally {
                System.out.println("very important text");
            }





            if (b == 0) {
                System.out.println("b can't be zero. Please change that value and restart the program");
                continue;
            }

            double c = divide(a, b);
            System.out.println(c);
            System.out.println("=====");
        }
    }

    public static double divide(double a, double b) throws ArithmeticException {
        return a / b;
    }

    public static int getRandomNumber() throws IOException, RandomGeneratedException {
        Random random = new Random();

        int r = random.nextInt() % 10;

        if (r == 0) {
            throw new RandomGeneratedException("RandomGeneratedException: random number can't be 0");
        }

        if (true){
            throw new IOException("IOException");
        }


        return r;
    }
}
