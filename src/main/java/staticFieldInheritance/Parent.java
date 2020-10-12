package staticFieldInheritance;

public class Parent {
    public static int a = 10;

    public Parent() {
        System.out.println("PARENT : public static int a = " + a);
    }
}
