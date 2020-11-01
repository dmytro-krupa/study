package lec5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class OOPExample2 {
    static class User{
        private List<Order> orders;

    }

    static class Book{
        private List<Order> orders;
    }

    static class Order{
        private User user;
        private List<Book> book;
        private LocalDateTime time;
    }

    static class OrderDetails{
        private Book book;
        private Order order;
        private int numberOfBooks;
    }

}
