package lec3.practice_2023;

public class IdGenerator {
    private static Long orderIdGenerator = 0L;

    public static Long getOrderId(){
        ++orderIdGenerator;
        return orderIdGenerator;
    }
}
