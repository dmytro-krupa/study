package lec4.old;

public class BadCodeEx {
    public static void main(String[] args) {
        final int[] x = {1, 2, 6, 2, 6, 9, 3, 6, 2, 8, 12, 68, 0};

        final int number = 6;

        System.out.println(countNumber(x, number));

    }


    public static int countNumber(final int[] ints, final int number) {
        int counter = 0;
        for (int i : ints) {
            if (i == number) {
                counter++;
            }
        }
        return counter;
    }
}
