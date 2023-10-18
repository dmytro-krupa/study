package lec6.collection_example;

import java.util.*;

public class Printer {
    public void printBooks(User user, boolean printUnique){
        String toPrint = printUnique ?  booksSet(user.getTakenBookList()) : booksList(user.getTakenBookList());

        System.out.println(toPrint);
    }

    private String booksList(List<Book> takenBookList){
        List<String> titles = new ArrayList<>();

        for(Book book : takenBookList){
            titles.add(book.getTitle());
        }

        return formatString(titles);
    }

    private String booksSet(List<Book> takenBookList){
        Set<String> titles = new HashSet<>();

        for(Book book : takenBookList){
            titles.add(book.getTitle());
        }

        return formatString(titles);
    }

    private String formatString(Iterable<String> set){
        return set.toString().substring(1, set.toString().length() - 1);
    }
}
