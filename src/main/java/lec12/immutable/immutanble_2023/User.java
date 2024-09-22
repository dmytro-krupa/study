package lec12.immutable.immutanble_2023;

import java.util.Collections;
import java.util.List;

public class User {
    private final String name;
    private final String surname;
    private final List<String> accessList;

    public User(String name, String surname, List<String> accessList) {
        this.name = name;
        this.surname = surname;
        this.accessList = accessList;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<String> getAccessList() {
        return Collections.unmodifiableList(accessList);
    }
}


