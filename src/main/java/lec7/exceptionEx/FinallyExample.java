package lec7.exceptionEx;

public class FinallyExample {
    public static void main(String[] args) {
        int x = get();

        System.out.println(x);
    }

    static int get(){

        try{
            A a = null;
//            A a = new A();

            a.hashCode();

            return 4;
        } catch (NullPointerException e){
            return 2;
        } finally {
            return 6;
        }
    }


    static class A{}
}
