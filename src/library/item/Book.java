package library.item;


public class Book extends Item {
    String ISBN;
    String author;

    public Book(String title, String ISBN, String author) {
        super(title);
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }
}
