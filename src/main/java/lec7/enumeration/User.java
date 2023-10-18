package lec7.enumeration;

public class User {
    private String name;
    private String surname;
    private UserType userType;

    public User() {
    }

    public User(String name, String surname, UserType userType) {
        this.name = name;
        this.surname = surname;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
