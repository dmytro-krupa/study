package lec5.students;

public class Main {
    //    Приклад (студенти, групи, предмети)
    // Написати метод додавання предмету всім студентам заданої групи

    public static void main(String[] args) {
        Subject math = new Subject("Math");
        Subject programming = new Subject("Creating bugs");

        Group ri21 = new Group("ri-21");

        Student student1 = new Student("st", "1");
        Student student2 = new Student("st", "2");

        ri21.addStudent(student1);
        ri21.addStudent(student2);

        ri21.addSubjectForAllStudents(math);
        ri21.addSubjectForAllStudents(programming);



        Student student3 = new Student("st", "new");
        ri21.addStudent(student3);


        System.out.println(ri21);
    }
}
