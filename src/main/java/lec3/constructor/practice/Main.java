package lec3.constructor.practice;

public class Main {
    public static void main(String[] args) {
        User admin = Admin.generateMainAdmin();
        User admin2 = Admin.generateMainAdmin();

        User manager = new RegularUser("t");
        User client = new RegularUser("e");
    }
}
