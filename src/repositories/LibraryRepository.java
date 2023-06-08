package repositories;

import library.item.Book;
import library.item.Item;
import library.item.Movie;

import java.util.HashSet;

public class LibraryRepository {
    HashSet<Item> inventory = new HashSet<>();

    public LibraryRepository() {
        initializeLibrary();
    }

    private void initializeLibrary() {
        Book book1 = new Book(1, "The Lord of the Rings", "978-0261103252", "J.R.R. Tolkien");
        Book book2 = new Book(2, "The Hobbit", "978-0261103283", "J.R.R. Tolkien");

        inventory.add(book1);
        inventory.add(book2);

        Movie movie1 = new Movie(3, "The Lord of the Rings: The Fellowship of the Ring", "tt0167261", "Peter Jackson", 180);
        Movie movie2 = new Movie(4, "The Lord of the Rings: The Two Towers", "tt0167260", "Peter Jackson", 179);

        inventory.add(movie1);
        inventory.add(movie2);
    }

    public HashSet<Item> getInventory() {
        return inventory;
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

}
