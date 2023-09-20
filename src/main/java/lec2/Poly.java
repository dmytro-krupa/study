package lec2;

public class Poly {
    public static void main(String[] args) {
        Person[] people = new Person[3];


        Admin admin = new Admin();
        admin.setName("Taras");

        User user1 = new User();
        user1.setName("Inna");
        User user2 = new User();
        user2.setName("Ira");

        people[0] = user1;
        people[1] = admin;
        people[2] = user2;


        for (Person person : people){
            System.out.println(person.print());
        }
    }

    static class Person{
        private String name;

        public String print() {
            return name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    static class User extends Person{
        int age;
        @Override
        public String print() {
            return "User: " + this.getName();
        }
    }
    static class Admin extends Person{
        @Override
        public String print() {
            return "Admin: " + this.getName();
        }
    }
}
