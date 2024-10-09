package lec7.java_2024.inner.lambda;

public class Main {
    public static void main(String[] args) {
        int x = 4;

        Button minus = (p) -> {
            System.out.println("-" + p + x);
            System.out.println("-" + p);
            System.out.println("-" + p);
            System.out.println("-" + p);
        };

        minus.action(5);
    }
}
