package practice_oop_2022.univercity;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Dima");
        student.setSurname("Krupa");

        System.out.println(student.getName());
        System.out.println(student.getSurname());
    }
}
