package library;

import library.item.Book;
import library.item.Item;
import library.item.Movie;
import repositories.LibraryRepository;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    LibraryRepository libraryRepository = new LibraryRepository();

    List<Item> inventory = libraryRepository.getInventory();

    public InventoryManager() {
    }


    public List<Item> getInventory() {
        return inventory;
    }

    public void addBook(String title, String ISBN, String author) {
        Book book = new Book(title, ISBN, author);
        inventory.add(book);
    }

    public void addMovie(String title, String IMDb, String director, String genre, int length) {
        Movie movie = new Movie(title, IMDb, length);
        inventory.add(movie);
    }

    public List<Item> searchItem(String search) {
        List<Item> filteredItems = new ArrayList<>();
        for (Item item : inventory) {
            String itemTitle = item.getTitle().toLowerCase();
            if (itemTitle.contains(search)) {
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }
}
