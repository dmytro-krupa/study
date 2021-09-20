package study;

public class B extends A{
    public static void a(){
        System.out.println("static b");
    }

    @Override
    public void print(){
        System.out.println("print b");
    }
}
