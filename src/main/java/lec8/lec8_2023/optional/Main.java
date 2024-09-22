package lec8.lec8_2023.optional;

import lec7.exceptionEx.customEx.ResourceNotFoundException;

import java.util.Optional;

public class Main {
    public static void main(String[] args) throws Exception {

        Optional<User> optional = findUser();

        User user = optional.orElseThrow(() -> new ResourceNotFoundException());

        System.out.println(user.getX());
    }

    public static Optional<User> findUser(){
        return Optional.ofNullable(null);
//        return Optional.ofNullable(new User(7));
    }

    public static class User{
        int x = 4;

        public User() {
        }

        public User(int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }
    }
}
