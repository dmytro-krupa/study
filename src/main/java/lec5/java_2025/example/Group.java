package lec5.java_2025.example;

import lec5.java_2025.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return Collections.unmodifiableList(studentList);
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
