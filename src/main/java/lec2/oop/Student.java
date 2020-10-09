package lec2.oop;

import java.util.Objects;

public class Student extends Person{

    private int mark; // mark = 0

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String getFirstName() {
        System.out.println("Student getFirstName method call()");
        return super.getFirstName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return mark == student.mark;
    }

    @Override
    public int hashCode() {
        return 17 * mark +
                17 * this.getFirstName().hashCode() +
                17 * this.getLastName().hashCode() +
                17 * this.getYob();
    }
}
