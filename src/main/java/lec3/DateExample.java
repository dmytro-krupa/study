package lec3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();

        LocalDateTime date1 = date.plusMonths(5);

        System.out.println(date1);
    }
}
