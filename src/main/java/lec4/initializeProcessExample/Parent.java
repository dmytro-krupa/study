package lec4.initializeProcessExample;

public class Parent {
    //1
    public static int a = 10;

    //2.1
    static {
        System.out.println("Parent static block");
    }



    //3
    public String name = "Parent name";

    //3.1
    {
        name = "" + 1;
        System.out.println("Parent non-static block");
    }



    //4
    public Parent() {
        System.out.println("PARENT : public static int a = " + a);
        System.out.println("PARENT : public String name = " + name);

    }
}
