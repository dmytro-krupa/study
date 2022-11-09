package lec7.constants;

public final class ConstantClass {
    public static final int SUPER_NUMBER = 43;

    public static class  InnerConstantClass{
        public static final int JUST_NUMBER = 45;
    }

    public static class UserConstants{
        public static class Admin{
            public static final String ADMIN_ROLE = "ADMIN_ROLE";
            public static final String ADMIN_URL = "some main url";
        }
        public static class Manager{
            public static final String MANAGER_ROLE = "MANAGER_ROLE";
        }
    }

    public static class UrlConstants{
        public static class Admin{
            public static final String URL = "ADMIN_URL";
        }
        public static class Manager{
            public static final String URL = "MANAGER_URL";
        }
    }

    private ConstantClass(){}
}
