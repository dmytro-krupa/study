package lec4.java_2025;

public class PassingToMethod {
    public static void main(String[] args) {
        Value y = new Value();
        y.x = 3;

        test(y);

        System.out.println("y.x = " + y.x);
    }


    //y = soihgwpi24552345
    //value = y -> value = soihgwpi24552345

    static void test(Value value){
        value = new Value(); // value = 234532523524gsfg
        value.x = 5;

        System.out.println("value = " + value.x);
    }

    static class Value{
        int x;
    }
}
