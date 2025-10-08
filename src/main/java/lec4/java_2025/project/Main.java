package lec4.java_2025.project;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Author king = new Author("King", "king@gmail.com");
        Author rouling = new Author("Rouling", "potter@ukr.new");


        Book book1 = new Book("11/22/63", 2011, king, 3000);
        Book book2 = new Book("Керрі", 1986, king, 5000);
        Book book3 = new Book("Гаррі Поттер та келих вогню", 2004, rouling, 10_000);



        //================================================================



        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        int kingCount = 0;

        for(Book book : books){
            if(book.getAuthor().equals(king)){
                kingCount += book.getNumberOfBooks();
            }
        }



//        int totalCount = 0;

//        //why null??
//        for(Book book : books.getAll()){
//            totalCount += book.getNumberOfBooks();
//        }
//


        //================================================================


        System.out.println(books);

//        System.out.printf("We produced %s Steven King books!", kingCount);
//        System.out.printf("We produced %s books!%n", totalCount);

    }
}
