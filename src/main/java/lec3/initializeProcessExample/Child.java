package lec3.initializeProcessExample;

public class Child extends Parent {
    //2
    public static int b = 10;

    //5
    public String name = "Child name";
    //5
    public String childName = "Child name";

    //6
    public Child() {
        //неявно викликається батьківський конструктор
        System.out.println("CHILD : public static int a = " + a);
        System.out.println("CHILD : public static int b = " + b);


//        System.out.println(name);
//        System.out.println(name);
//        System.out.println(super.name);


        //конструктор ЗАВЖДИ перший
        //        super();
    }
}
