package lec7.java_2024.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<User> userList = getTestData();

//        System.out.println(userList);

        Optional<Integer> sum = userList.stream()
                .filter(e -> e.getAge() == 34)
                .map(e -> e.getAge())
                .reduce((a, b) -> a + b);


        if(sum.isEmpty()){
            System.out.println("is empty");
        } else {
            System.out.println(sum.get());
        }


//        List<Integer> ages = userList.stream()
//                .map(User::getAge)
//                .distinct()
//                .collect(Collectors.toList());
//
//        int sumAge = userList.stream()
//                .map(User::getAge)
//                .distinct()
//                .reduce((a, b) -> a + b)
//                .get();
//
//        System.out.println(sumAge);


//        List<User> validUsers = new ArrayList<>();

//        for(User obj : userList){
//            if(obj.getAge() >= 0){
//                validUsers.add(obj);
//            }
//        }

//
//       Map<Integer, Integer> result = userList.stream()     //Map<Age, NumberOfUsers>
//       userList.stream()     //Map<Age, NumberOfUsers>
//                .filter(e -> e.getAge() >= 0)
//                .distinct()
////               .map(e -> e.getEmail())
////                .map(e -> {
////                    e.setEmail(e.getEmail() + "0");
////                    return e.getEmail();
////                })
////                .limit(3)
////                .peek(e -> System.out.println(e))
//
//               .mapToInt(e -> e.getAge())
//                .reduce(0, (left, right) -> left + right );
////               .reduce( (s1, s2)-> s1 + " " + s2)
////               .orElse("empty");
//        .collect(Collectors.groupingBy(e -> e.getAge()))
//               .entrySet().stream()
//               .map(e -> e.getValue().size())
//               .collect(Collectors.toList());


//               Map<Integer, Integer> result = userList.stream()     //Map<Age, NumberOfUsers>
//                .filter(e -> e.getAge() >= 0)
//                .distinct()
//                .collect(Collectors.groupingBy(e -> e.getAge()))
//                .entrySet().stream()
//                       .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().size()));


//        System.out.println("+++  " + result);


//        System.out.println(result);


        //map to another map
        //reduce with accumulator


//        System.out.println(userList);
//        System.out.println("Base list size = " + userList.size());
//        System.out.println("Result list size = " + validUsers.size());
//        System.out.println(validUsers);


//     String x = userList.stream()
//                .distinct()                                   //нетермінальний метод
//                .filter(user -> user.getAge() >= 18)
//                .sorted((o1, o2) -> o1.getAge() > o2.getAge() ? 1 : -1)     //нетермінальний метод
//                .peek(user -> user.setEmail(user.getEmail() + "1"))             //нетермінальний метод
////                .peek(e -> System.out.println(e))                           //нетермінальний метод
//                .limit(43)
//             .map(e -> e.getEmail())
//             .reduce((s1, s2) -> s1 + " " + s2).orElse("");


//        System.out.println(x);


//        System.out.println(count);


//        long userListFiltered = userList.stream()
//                .distinct()
//                .filter(user -> user.getAge() >= 18)
////                .mapToInt(user -> user.getAge())
//
//                .count();


//                .mapToInt(user -> user.getAge())

//        System.out.println("TEST");

//        System.out.println(userListFiltered.count());


//                .reduce((s1, s2) -> s1 + s2)
//                .orElse(0);
//                .collect(Collectors.toList());


//        System.out.println(userListFiltered);

    }

    public static List<User> getTestData() {
        final User user1 = new User("firstName", "lastName", "email@ukr.net", 23, Collections.singletonList("someNote"));
        final User user2 = new User("firstName2", "lastName2", "email2@ukr.net", 23, Collections.singletonList("someNote"));
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
        userList.add(user6);

        return userList;
    }
}
