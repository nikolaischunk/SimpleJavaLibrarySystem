package library.item;


import static utils.Display.print;

public class Book extends Item {
    String ISBN;
    String author;

    public Book(int id, String title, String ISBN, String author) {
        super(id, title);
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Book: " + getTitle() + " by " + getAuthor();
    }

    public void displayItem(boolean detailed) {
        super.displayItem(detailed);
        print("Author: " + author);
        if (detailed) print("ISBN: " + ISBN);
    }
}
