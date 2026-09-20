package Bogsamling;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book
                ("The Hobbit", "J.R.R. Tolkien, ", 1937, true,Genre.FANTASY);

        Book book2 = new Book("Harry Potter og De Vises Sten ", "J.K. Rowling,", 1997, false, Genre.ACTION);

        Book book3 = new Book("1984", "George Orwell, ", 1949, false, Genre.DYSTOPIAN);

        Library library = new Library("Min bogsamling");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("Antal bøger: " + library.getNumberOfBooks());

        Book foundBook = library.findBookByTitle("Da Vinci code");
        if (foundBook != null) {
            foundBook.printInfo();
        } else {
            System.out.println("Bogen blev ikke fundet.");
        }

        Book foundAuthor = library.findBooksbyAuthor("George Orwell");
        if (foundAuthor!= null) {
            foundAuthor.printInfo();
        } else{
            System.out.println("Forfatteren blev ikke fundet. ");
        }

        library.printBooks();
        boolean removed = library.removeBookByTitle("The Hobbit");
        System.out.println(removed);

        System.out.println(library.getNumberOfReadBooks());

        library.printUnreadBooks();

    }
}
