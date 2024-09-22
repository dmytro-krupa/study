package lec8;

import lec7.exceptionEx.ErrorCode;
import lec7.exceptionEx.SystemException;

import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) throws Exception{
        final User user1 = new User("firstName", "lastName", "email@ukr.net", 12, Collections.singletonList("someNote"));
//        final User user1 = null;
        Optional<User> optional = Optional.of(user1);


//        final User user2 = new User("O", "lastName", "email@ukr.net", 12, Collections.singletonList("someNote"));
        final User user2 = null;


        //=====================================

//        String string;
//
//        if(user2 != null && user2.getFirstName() != null){
//            string = user2.getFirstName();
//        } else {
//            string = "no";
//        }
//
//
//
//        if(optional.isEmpty()){
//            System.out.println("Empty");
//        } else {
//            System.out.println("Not empty");
//        }
//




        User user = optional.orElse(new User());

//        User user = optional.orElseThrow(() -> new SystemException("", ErrorCode.ERROR_400));





        String string = optional.map(e -> e.getFirstName()).orElse("no");

        System.out.println(string);


    }
}
