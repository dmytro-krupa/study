package lec5.students;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private final List<Student> students = new ArrayList<>();

    private final List<Subject> subjects = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        this.students.add(student);

        for(Subject subject : subjects){
            student.addSubject(subject);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }


    public void addSubjectForAllStudents(Subject subject){
        this.subjects.add(subject);

        for(Student student : students){
            student.addSubject(subject);
        }
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
