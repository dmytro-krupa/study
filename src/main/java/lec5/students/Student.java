package lec5.students;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstname;
    private String lastname;

    private Group group;

    private List<Subject> subjects = new ArrayList<>();

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void addSubject(Subject subject){
        this.subjects.add(subject);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
