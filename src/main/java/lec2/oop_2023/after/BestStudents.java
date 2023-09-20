package lec2.oop_2023.after;

public class BestStudents {
    public static void main(String[] args) {

        String student1 = "Dmytro 100";
        String student2 = "Olha 99";
        String student3 = "Inna 98";



//  ====================================================================

        Student studentObject1 = Student.getFromInput(student1);
        Student studentObject2 = Student.getFromInput(student2);
        Student studentObject3 = Student.getFromInput(student3);

        Array array = new Array();

        array.addStudent(studentObject1);
        array.addStudent(studentObject3);
        array.addStudent(studentObject2);
        array.addStudent(studentObject2);
        array.addStudent(studentObject2);
        array.addStudent(studentObject2);
        array.addStudent(studentObject2);
        array.addStudent(studentObject2);
        array.addStudent(studentObject2);
        array.addStudent(studentObject2);
        array.addStudent(studentObject2);
        array.addStudent(studentObject2);

        array.print();
    }
}
