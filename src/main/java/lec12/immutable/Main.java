package lec12.immutable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Subject subject1 = new Subject("Math");
        Subject subject2 = new Subject("C++");

        ImmutableUser user = new ImmutableUser("name1", "surname2", subject1, subject2);

        List<Subject> subjects = user.getSubjects();

        subjects.add(subject1);

        System.out.println(user.getSubjects());
    }
}
