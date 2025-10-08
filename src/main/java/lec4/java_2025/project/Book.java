package lec4.java_2025.project;

public class Book {
    private String title;
    private int year;
    private Author author;
    private int numberOfBooks;

    public Book(String title, int year, Author author, int numberOfBooks) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", numberOfBooks=" + numberOfBooks +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }


}
