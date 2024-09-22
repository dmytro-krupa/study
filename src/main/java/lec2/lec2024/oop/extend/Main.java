package lec2.lec2024.oop.extend;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();


        System.out.println(   ((Student) person).getFullName()   );



//        System.out.println(   ((Student)((Person) student)).getFullName()   );

    }
}
