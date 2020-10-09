package lec2.oop;

import lec1.ArrayExample;

public class SimpleOOPExample {
    public static void main(String[] args) {

//        Person person = new Person();
//
//        person.setFirstName("igor");
//
//        System.out.println(person.getFirstName());


//    Student student = new Student();
//
//    student.setFirstName("igor");
//    student.setMark(88);
//
//    System.out.println(student.getFirstName());
//    System.out.println(student.getMark());


//        Student student = new Student();
//
//        student.setFirstName("igor");
//        student.setMark(88);
//
//        User user = new User();
//
//        user.setFirstName("anna");
//        user.setEmail("anna@gmail.com");
//
//
//
//
//        Person[] array = new Person[2];
//
//        array[0] = student;
//        array[1] = user;
//
//
//
//        for (Person person : array){
//            System.out.println(person.getFirstName());
//            System.out.println();
//        }



        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s1.equals(s1));

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));



    }
}
