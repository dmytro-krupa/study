package lec4;

public class GenericMethod {
    public static void main(String[] args) {
        System.out.println(sum(1.3, 3.2));

    }


    public static <T> void test(T y){
        System.out.println("some text: " + y);
    }



    public static <T extends Number> double sum(T x, T y){
        return x.doubleValue() + y.intValue();
    }



}
