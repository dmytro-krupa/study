package lec6;


public class EnumExample {
    public static void main(String[] args) {


        UserType someType = UserType.ADMIN;

//        System.out.println("someType.name() = " + someType.name());
//        System.out.println("someType.ordinal() = " + someType.ordinal());
//        System.out.println("someType.toString() = " + someType.toString());

//
//        for(UserType userType : UserType.values()){
//            System.out.println("userType : " + userType);
//        }

        UserType anotherType = UserType.ADMIN;

//        System.out.println(anotherType == someType);

        //============================================




//        UserType userType1 = UserType.valueOf("admin");
        UserType userType1 = UserType.valueOf("ADMIN");

//        System.out.println("11 : " + userType1);
//
//
//
//        System.out.println(UserType.fromValue("admin"));
//        System.out.println(UserType.fromValue("ADMIN"));



        //============================================

        NotSimple notSimple = NotSimple.A;

//        System.out.println("notSimple = " + NotSimple.A.getDescription());

//        notSimple.setDescription("dfff");

//        System.out.println("notSimple = " + NotSimple.A.getDescription());

        //========================================

        User user = new User();
        user.userType = UserType.MANAGER;



        switch (user.userType){
            case USER -> System.out.println(" 1 : USER");
            case MANAGER -> System.out.println(" 1 : MANAGER");
            case ADMIN -> System.out.println(" 1 : ADMIN");
            default -> System.out.println("default");
        }




        //=========================================
    }

    public static class User{
        String email;
        UserType userType;
    }

    public interface A{
        void q();
    }
    public enum WrongEnum implements A{
        T;

        @Override
        public void q() {

        }
    }

    public enum UserType {
        ADMIN,
        USER,
        MANAGER;


        public static UserType fromValue(String value){
            String upperCaseValue = value.toUpperCase();

            for(UserType userType : UserType.values()){
                if(userType.name().equals(upperCaseValue)){
                    return userType;
                }
            }

            return null;
        }
    }

    public enum NotSimple{
        A("Some description for A", 100),
        B("Some description for B", 101),
        OK_200("Some description for C", 102);

        private String description;
        private int i;

        NotSimple(String description, int i) {
            this.description = description;
            this.i = i;
        }

        public String getDescription() {
            return description;
        }

        public int getI() {
            return i;
        }

    }
}
