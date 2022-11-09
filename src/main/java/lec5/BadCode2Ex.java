package lec5;

public class BadCode2Ex {
    public static void main(String[] args) {
        User old = new User();
        old.name = "bla-bla";

        User created = getNewUser(old);


        getNewUser(old);
        getNewUser(old);



        System.out.println(old);
        System.out.println(created);
    }

    static class User{
        String name;

        @Override
        public String toString() {
            return name;
        }
    }

    public static User getNewUser(User old) {
        User created = new User();
        created.name = old.name + "!!!";

        return created;
    }



    /*
    User a = null;




     */






}
