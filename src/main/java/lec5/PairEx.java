package lec5;

public class PairEx {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair = new Pair<>(3, 4);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        System.out.println();
        System.out.println("sum = " + (pair.getKey() + pair.getValue()));
    }
}
