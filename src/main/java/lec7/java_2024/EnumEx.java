package lec7.java_2024;

public class EnumEx {
    public static void main(String[] args){
        Day day1 = Day.FRIDAY;

        switch (day1){
            case MONDAY -> System.out.println("Bad day");
            case TUESDAY -> System.out.println("Not bad day");
            default -> throw new IllegalArgumentException("Day not found");
        }
    }
}
