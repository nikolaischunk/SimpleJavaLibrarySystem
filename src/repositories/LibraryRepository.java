package repositories;

import library.item.Book;
import library.item.Item;
import library.item.Movie;

import java.util.ArrayList;
import java.util.List;

public class LibraryRepository {
    List<Item> inventory = new ArrayList<>();

    public LibraryRepository() {
        initializeLibrary();
    }

    private void initializeLibrary() {
        Book book1 = new Book("The Lord of the Rings", "978-0261103252", "J.R.R. Tolkien");
        Book book2 = new Book("The Hobbit", "978-0261103283", "J.R.R. Tolkien");

        inventory.add(book1);
        inventory.add(book2);

        Movie movie1 = new Movie("The Lord of the Rings: The Fellowship of the Ring", "tt0167261", 180);
        Movie movie2 = new Movie("The Lord of the Rings: The Two Towers", "tt0167260", 179);

        inventory.add(movie1);
        inventory.add(movie2);
    }

    public List<Item> getInventory() {
        return inventory;
    }


    public void removeItem(Item item) {
        inventory.remove(item);
    }

}
