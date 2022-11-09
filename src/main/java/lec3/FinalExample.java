package lec3;

public class FinalExample {
    public static void main(String[] args) {
        final int a = 4;
        int b = 7;

        final int c = calc(a, b);

        System.out.println(c);
    }

    private static int calc(int x, int y){

        return x + y;
    }
}
