package lec2.oop;

public class Person {
    private String firstName;
    private String lastName;
    private int yob;

    public String getFirstName() {
//        System.out.println("Some data");
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
}
