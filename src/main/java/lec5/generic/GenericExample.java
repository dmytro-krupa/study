package lec5.generic;


import lec2.OOPExample;
import lec2.oop.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {

        Book[] books = new Book[2];

        books[0] = new Book("title 1", 300);
        books[1] = new Book("title 2", 150);


        User[] users = {new User("email@ukr.net"), new User("another-email@gmail.com")};

        //тут лише довжина books
        System.out.println(books.length);

//        Pair<User, Book> pair = getPair(books, users);
        Pair<User, Book> pair = getPair(books, users);




    }

    public static Pair<User, Book> getPair(Book[] books, User[] users){
        return new Pair<>(users[0], books[0]);
    }

    public static BigTuple<User, Book, LocalDate> getBigTuple(Book[] books, User[] users){
        return new BigTuple<>(users[0], books[0], LocalDate.now());
    }
}
