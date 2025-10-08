package lec5.java_2025;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Student s1 = new Student("A", "B");
        Student s2 = new Student("Dmytro", "First");
        Student s3 = new Student("Ihor", "Second");
        Student s4 = new Student("Taras", "Third");

        Map<Integer, Student> map = new HashMap<>();

        map.put(1, s1);
        map.put(2, s2);
        map.put(3, s3);
        map.put(4, s4);

        map.putIfAbsent(1, s4);


        System.out.println(map);
    }
}
