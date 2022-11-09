package lec5.staticFieldInheritance;

public class StaticFieldInheritanceExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent.a = 663;


        System.out.println("Child.a " + child.a);
        System.out.println("Child.b " + Child.b);
        System.out.println("Parent.a " + Parent.a);

    }
}
