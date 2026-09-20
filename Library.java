package Bogsamling;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;
    private boolean removeBookByTitle;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooks() {
        for (int i = 0; i < books.size(); i++) {
            books.get(i).printInfo();
        }
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public void printUnreadBooks() {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.isRead() == false) {
                book.printInfo();
            }
        }
    }

    public boolean removeBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    public Book findBooksbyAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    public int getNumberOfReadBooks(){
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isRead()) {
                count++;
            }
        }
        return count;
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}

