package lec3.constructor;

public class ConstructorExample {
    // оператор new повертає посилання на створени й об'єкт
    public static void main(String[] args) {
        final Lec3User user = new Lec3User();
        final Lec3User user1 = new Lec3User("test user", 22);

        System.out.println(user);
        System.out.println(user1);
    }
}
