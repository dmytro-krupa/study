package lec12.immutable.immutable_old;

import java.util.List;

public class ImmutableUser {
    private final String name;
    private final String surname;

    private List<Subject> subjects;

    public ImmutableUser(String name, String surname, Subject subject1, Subject subject2) {
        this.name = name;
        this.surname = surname;
//        subjects = new ArrayList<>();
        subjects = List.of(subject1, subject2);

//        subjects.add(subject1);
//        subjects.add(subject2);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
