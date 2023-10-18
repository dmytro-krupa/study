package lec7.enumeration;

public class Main {
    public static void main(String[] args) {
//        User admin = new User("system", "admin", UserType.ADMIN);

    }

    public static void print(User user) {
        switch (user.getUserType()) {
            case MANAGER -> System.out.println("this is manager");
            case REGULAR_USER -> System.out.println("this is user");
            default -> System.out.println("error");
        }
    }
}
