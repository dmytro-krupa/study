package lec3.initializeProcessExample;

public class Parent {
    //1
    public static int a = 10;

    //2
    static {
        System.out.println("Parent static block");
    }

    //3
    {
        name = "";
        System.out.println("Parent non-static block");
    }

    //3
    public String name = "Parent name";

    //4
    public Parent() {
        System.out.println("PARENT : public static int a = " + a);
        System.out.println("PARENT : public String name = " + name);

    }
}
