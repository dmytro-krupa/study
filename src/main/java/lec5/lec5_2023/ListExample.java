package lec5.lec5_2023;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        Map<User, Integer> userMap = new HashMap<>();

        User user1 = new User("User 1", 1);
        User user2 = new User("admin 1", 2);
        User user3 = new User("user 3", 3);

        userMap.put(user1, 2);
        userMap.put(user2, 5);
        userMap.put(user3, 5);


        System.out.println(userMap.values());
    }

    static class User{
        private String name;
        private int id;

        public User(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
