package lec5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetObjectExample {
    public static void main(String[] args) {
        Student a = new Student(5, "a");
        Student b = new Student(7, "b");

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(a);
        studentSet.add(b);

        System.out.println(studentSet);

    }

    static class Student{
        private long id;
        private String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
//            return id == student.id &&
//                    Objects.equals(name, student.name);

            return true;
        }

        @Override
        public int hashCode() {
//            return Objects.hash(id, name);
            return 1;
        }

        public Student(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
