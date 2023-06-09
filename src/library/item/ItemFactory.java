package library.item;

import static utils.Util.generateRandomId;

public class ItemFactory {

    int id = generateRandomId();

    public ItemFactory() {
    }

    public Movie createMovie(String title, String IMDb, String director, int length) {
        return new Movie(this.id, title, IMDb, director, length);
    }

    public Book createBook(String title, String ISBN, String author) {
        return new Book(this.id, title, ISBN, author);
    }
}
