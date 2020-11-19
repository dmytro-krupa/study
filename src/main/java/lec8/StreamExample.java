package lec8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        final User user1 = new User("firstName", "lastName", "email@ukr.net", 12, Collections.singletonList("someNote"));
        final User user2 = new User("firstName2", "lastName2", "email2@ukr.net", 20, Collections.singletonList("someNote"));
        final User user3 = new User("firstName3", "lastName3", "email3@ukr.net", 67, Collections.singletonList("someNote"));
        final User user4 = new User("firstName4", "lastName4", "email4@ukr.net", 11, Collections.singletonList("someNote"));
        final User user5 = new User("firstName5", "lastName5", "email5@ukr.net", 5, Collections.singletonList("someNote"));
        final User user6 = new User("firstName6", "lastName6", "email6@ukr.net", -45, Collections.singletonList("someNote"));
        final User user7 = new User("firstName7", "lastName7", "email7@ukr.net", 24, Collections.singletonList("someNote"));
        final User user8 = new User("firstName8", "lastName8", "email8@ukr.net", 23, Collections.singletonList("someNote"));
        final User user9 = new User("firstName9", "lastName9", "email9@ukr.net", 34, Collections.singletonList("someNote"));
        final User user10 = new User("firstName10", "lastName10", "email10@ukr.net", 37, Collections.singletonList("someNote"));
        final User user11 = new User("firstName11", "lastName11", "email11@ukr.net", 98, Collections.singletonList("someNote"));

        List<User> userList = new ArrayList<>();

        userList.add(user1);
        userList.add(user1);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);
        userList.add(user10);
        userList.add(user11);


//        long userListFiltered = userList.stream()
//                .distinct()
//                .filter(user -> user.getAge() >= 18)
////                .mapToInt(user -> user.getAge())
//
//                .count();

        User userListFiltered = userList.stream()
                .distinct()
                .filter(user -> user.getAge() >= 18)
                .findAny()
                .get();




//                .mapToInt(user -> user.getAge())

        System.out.println("TEST");

//        System.out.println(userListFiltered.count());



//                .reduce((s1, s2) -> s1 + s2)
//                .orElse(0);
//                .collect(Collectors.toList());




        System.out.println(userListFiltered);

    }
}
