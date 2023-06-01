package library.item;


import java.util.Date;

public class Book extends Item {
    String ISBN;
    String author;
    Date publishDate;
    public Book(String title) {
        super(title);
    }
}
