package lec7.inner_2023.lambda;

public class Main {
    public static void main(String[] args) {
        int x = 4;
        Button plus = new Button() { //implements
            @Override
            public void action(int a) {
                System.out.println("+" + a + x);
            }
        };

        Button minus = (p) -> {
            System.out.println("-" + p + x);
            System.out.println("-" + p);
            System.out.println("-" + p);
            System.out.println("-" + p);
        };

        plus.action(4);
        minus.action(5);
    }
}
