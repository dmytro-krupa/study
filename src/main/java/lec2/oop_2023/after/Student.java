package lec2.oop_2023.after;

public class Student{
    private String name;
    private int mark;

    public Student() {
    }

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public static Student getFromInput(String input){
        Student student = new Student();

        student.setName(input.split(" ")[0]);
        student.setMark(Integer.parseInt(input.split(" ")[1]));

        return student;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
