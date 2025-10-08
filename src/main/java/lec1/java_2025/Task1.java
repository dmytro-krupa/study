package lec1.java_2025;

public class Task1 {

    public static void main(String[] args) {
        printSum(3,5);
    }

    static void printSum(int a, int b){
        int sum = a + b;
        System.out.println("Sum of %s and %s = %s".formatted(a , b, sum));
//        System.out.println("Sum of " + a + " and " + b + " = " + sum);
    }
}
