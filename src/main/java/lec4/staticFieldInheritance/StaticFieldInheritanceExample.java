package lec4.staticFieldInheritance;

public class StaticFieldInheritanceExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent.a = 663;

        System.out.println("Child.a " + Child.a);
        System.out.println("Child.b " + Child.b);
        System.out.println("Parent.a " + Parent.a);

    }
}
