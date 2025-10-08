package lec5.java_2025;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Student s1 = new Student("A", "B");
        Student s2 = new Student("Dmytro", "First");
        Student s3 = new Student("Ihor", "Second");
        Student s4 = new Student("Taras", "Third");

        Set<Student> students = new HashSet<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println(students);
    }

}
