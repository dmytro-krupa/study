package lec6.collection_example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> availableBooks = new ArrayList<>();
    private List<User> userList = new ArrayList<>();

    public void addBook(Book book){
        availableBooks.add(book);
    }
    public void giveBookToUser(String title, User user){
        Book book = getAvailableBookByTitle(title);

        if(book != null){
            user.getTakenBookList().add(book);
        }

        availableBooks.remove(book);
    }

    public Book getAvailableBookByTitle(String title){
        for(Book book : availableBooks){
            if(book.getTitle().equals(title)){
                return book;
            }
        }

        return null;
    }

    public void returnBook(User user, Book book){
        boolean userHadBook = user.getTakenBookList().remove(book);
        if(userHadBook){
            availableBooks.add(book);
        }
    }

    //String - назва книжки, а Integer кількість у бібліотеці
    public Map<String, Integer> countAllAvailableBooks(){
        Map<String, Integer> allBooksTitle = new HashMap<>();

        for(Book book : availableBooks){
            if(allBooksTitle.containsKey(book.getTitle())){
                allBooksTitle.put(book.getTitle(), allBooksTitle.get(book.getTitle()) + 1);
            } else {
                allBooksTitle.put(book.getTitle(), 1);
            }
        }

        return allBooksTitle;
    }
}
