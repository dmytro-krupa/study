package lec2.oop_2022;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private int year;

    public String getFullName(){
        if(middleName == null || middleName.isEmpty()){
            return firstName + " "  + lastName;
        } else {
            return firstName + " " + middleName + " " + lastName;
        }
    }

    public String getFirstName() {
        System.out.println("Some data");
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
        return year;
    }

    public void setYob(int yob) {
        this.year = yob;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + year;
    }
}
