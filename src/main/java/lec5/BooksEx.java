package lec5;

import java.util.*;



public class BooksEx {
    static List<Book> library = new ArrayList<>();

    public static void main(String[] args) {
        Book lotr1 = new Book(10, "LoTR 1");
        Book lotr2 = new Book(5, "LoTR 2");
        Book lotr3 = new Book(7, "LoTR 3");



        library.add(lotr1);
        library.add(lotr2);
        library.add(lotr3);

        System.out.println(library);


        User dima = new User("dima-krupa@ukr.net");

        giveBook(dima, "LoTR 1");
        giveBook(dima, "LoTR 2");
        giveBook(dima, "HP 4");
        giveBook(dima, "LoTR 2");

        System.out.println(library);

        System.out.println(dima);

    }

    static void giveBook(User user, String bookTitle){
       if(!validateIfBookExist(bookTitle)) {
           System.out.println("We don't have this book");
           return;
       }

       Book book = findBook(bookTitle);

       Map<Book, Integer> userBooks = user.getBooks();

       if(userBooks.containsKey(book)){
           userBooks.put(book, userBooks.get(book) + 1);
           reduceNumberOfBooks(book);
       } else {
           userBooks.put(book, 1);
           reduceNumberOfBooks(book);
       }

    }



    static void reduceNumberOfBooks(Book bookToReduce) {
        for (Book book : library) {
            if(book.equals(bookToReduce)){
                book.count = book.count - 1;
            }
        }
    }

    static Book findBook(String bookTitle){
        for(Book book : library){
            if(book.title.equals(bookTitle)){
                return book;
            }
        }
        return null;
    }

    static boolean validateIfBookExist(String name){
        for(Book book : library){
            if(book.title.equals(name)){
                return true;
            }
        }

        return false;
    }

    static class User{ //те саме що і читаціький квиток
        String email;
        Map<Book, Integer> books = new HashMap<>();

        public User(String email) {
            this.email = email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public Map<Book, Integer> getBooks() {
            return books;
        }

        @Override
        public String toString() {
            return "User{" +
                    "books=" + books +
                    '}';
        }
    }

    static class Book{
        Integer count;
        String title;

        public Book(Integer count, String title) {
            this.count = count;
            this.title = title;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(title, book.title);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "count=" + count +
                    ", title='" + title + '\'' +
                    '}';
        }
    }

}


