package lec6.collection_example;

public class Main {
    /*
        implement Library logic
     */

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1L, "Title_1");
        Book book2 = new Book(2L, "Title_2");
        Book book3 = new Book(3L, "Title_1");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        User dmytro = new User("Dmytro", "Krupa");
        User inna = new User("Inna", "Test");
        User ira = new User("Ira", "Test");

        System.out.println("Initial available books: " + library.countAllAvailableBooks());
        System.out.println();
        System.out.println();
        System.out.println("Suggested book: " + library.getAvailableBookByTitle("Title_1"));
        library.giveBookToUser("Title_1", dmytro);
        System.out.println("Book was given to: " + dmytro.getFullName());

        library.giveBookToUser("Title_1", inna);
        System.out.println("Book was given to: " + inna.getFullName());

        library.giveBookToUser("Title_1", ira);
        System.out.println("Book was given to: " + ira.getFullName());
        System.out.println();
        System.out.println();
        System.out.println("Available books: " + library.countAllAvailableBooks());

        System.out.println();
        System.out.println();

        System.out.printf("Taken books by %s: %s", dmytro.getFullName(), dmytro.getTakenBookList());
        System.out.println();
        System.out.printf("Taken books by %s: %s", inna.getFullName(), inna.getTakenBookList());
        System.out.println();
        System.out.printf("Taken books by %s: %s", ira.getFullName(), ira.getTakenBookList());


        library.returnBook(dmytro, book1);

        System.out.println();
        System.out.println();
        System.out.println("Available books: " + library.countAllAvailableBooks());
        System.out.printf("Taken books by %s: %s", dmytro.getFullName(), dmytro.getTakenBookList());
        System.out.println();
        System.out.printf("Taken books by %s: %s", inna.getFullName(), inna.getTakenBookList());
        System.out.println();
        System.out.printf("Taken books by %s: %s", ira.getFullName(), ira.getTakenBookList());

        System.out.println();
        System.out.println();
        library.giveBookToUser("Title_1", inna);
        Printer printer = new Printer();
        printer.printBooks(inna, false);
    }
}
