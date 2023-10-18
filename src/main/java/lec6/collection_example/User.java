package lec6.collection_example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;

    private List<Book> takenBookList = new ArrayList<>();


    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getTakenBookList() {
        return takenBookList;
    }

    public void setTakenBookList(List<Book> takenBookList) {
        this.takenBookList = takenBookList;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

}
