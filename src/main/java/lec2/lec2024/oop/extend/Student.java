package lec2.lec2024.oop.extend;

public class Student extends Person{
    private String middleName;

    public Student() {
        super("default", "default");
        this.middleName = "default";
    }

    public String getFullName(){
        return String.format("%s - %s - %s", getFirstname(), middleName, getLastname());
//        return getFirstname() + " " + middleName + " " + getLastname();
    }
}
