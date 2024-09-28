package lec5.old.lec5_2023;

public class GenericBase {
    public static void main(String[] args) {
        multiplyByThree(5);
        multiplyByThree(5L);
        multiplyByThree(5.8);
    }

    static <T extends Number> void multiplyByThree(T x){
        System.out.println(x.doubleValue() * 3);
    }


}
