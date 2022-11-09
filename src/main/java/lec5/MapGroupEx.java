package lec5;

import study.A;

import java.util.*;

//todo: do it using Streams


public class MapGroupEx {
    public static void main(String[] args) {
        Student a = new Student("a", "it-21");
        Student b = new Student("b", "it-22");
        Student c = new Student("c", "it-21");
        Student d = new Student("d", "it-21");
        Student e = new Student("e", "it-22");
        Student f = new Student("f", "it-21");
        Student g = new Student("g", "it-21");
        Student h = new Student("h", "it-23");


        List<Student> lpnu = new ArrayList<>();

        lpnu.add(a);
        lpnu.add(b);
        lpnu.add(c);
        lpnu.add(d);
        lpnu.add(e);
        lpnu.add(f);
        lpnu.add(g);
        lpnu.add(h);


        Set<String> groupNames = new HashSet<>();

        for(Student student : lpnu){
            groupNames.add(student.group);
        }

        Map<String, Integer> groupCount = new HashMap<>();


        for(String group : groupNames){
            int count = 0;
            for(Student student : lpnu){
                if(student.group.equals(group)){
                    count++;
                }
            }

            groupCount.put(group, count);
        }

        System.out.println(groupCount);


    }

    static class Student{
        String name;
        String group;

        public Student(String name, String group) {
            this.name = name;
            this.group = group;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(group, student.group);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, group);
        }
    }
}
