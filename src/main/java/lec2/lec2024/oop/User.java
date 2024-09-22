package lec2.lec2024.oop;

import lec9.solid.S;

public class User {
    private String firstname;
    private String middleName;
    private String lastname;

    private User(String firstname, String middleName, String lastname) {
        this.firstname = firstname;
        this.middleName = middleName;
        this.lastname = lastname;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public static User getSimpleUser(String firstname, String lastname){
        return new User(firstname, null, lastname);
    }
}
