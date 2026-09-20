package Bogsamling;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean read = false;
    private Genre genre;

    public Book(String title, String author, int publicationYear, boolean read, Genre genre  ){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.read = read;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Genre getGenre(){
        return genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isRead() {
        return read;
    }

    public void markAsRead() {
        this.read = true;
    }

    public void markAsUnread() {
        this.read = false;
    }

    public boolean isClassic(int currentYear) {
        if (publicationYear >= currentYear - 20) {
            return true;
        } else {
            return false;
        }
    }

    public void printInfo() {
        System.out.println(this.title + "\n" + this.author + "\n" + this.publicationYear + "\n" + this.read + "\n" + this.genre);
    }
}
