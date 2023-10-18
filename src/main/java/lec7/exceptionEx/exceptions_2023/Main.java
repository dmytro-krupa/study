package lec7.exceptionEx.exceptions_2023;

public class Main {
    public static void main(String[] args) {
        String number = "student";

        if(number.matches("")){
            System.out.println(Long.valueOf(number));
        } else {
            System.out.println("Wrong number");
        }

    }
}
