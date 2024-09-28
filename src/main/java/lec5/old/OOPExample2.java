package lec5.old;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class OOPExample2 {
    static class User{
        private List<Order> orders;

    }

    static class Book{
        private List<Order> orders;
    }

    static class Order{
        private long id;

        private User user;
        private List<Book> book;
        private LocalDateTime time;

        @Override
        public int hashCode() {
            return (int) id;
        }
    }

    static class OrderDetails{
        private Book book;
        private Order order;
        private int numberOfBooks;
    }

}
