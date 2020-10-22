package staticFieldInheritance;

public class Child extends Parent{
    public static int b = 10;

    public Child() {
        System.out.println("CHILD : public static int a = " + a);
        System.out.println("CHILD : public static int b = " + b);
    }
}
