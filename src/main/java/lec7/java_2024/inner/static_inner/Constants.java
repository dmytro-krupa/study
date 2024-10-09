package lec7.java_2024.inner.static_inner;

public final class Constants {
    private Constants() {}

    public static final long ONE = 1L;
    public static final long TWO = 2L;
    public static final long THREE = 3L;

    public static final class ADMIN{
        public static final long ONE = 1L;
        public static final long TWO = 2L;
        public static final long THREE = 3L;
    }

    public static final class MANAGER{
        public static final class RULE{
            public static final String baseRule = "remove user";

        }
        public static final long ONE = 1L;
        public static final long TWO = 2L;
        public static final long THREE = 3L;
    }
    public static final class USER{
        public static final long ONE = 1L;
        public static final long TWO = 2L;
        public static final long THREE = 3L;
    }
}
