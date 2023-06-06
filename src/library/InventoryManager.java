package library;

import library.item.Book;
import library.item.Item;
import library.item.Movie;
import repositories.LibraryRepository;

import java.util.ArrayList;
import java.util.List;

import static utils.Util.generateRandomId;

public class InventoryManager {

    LibraryRepository libraryRepository = new LibraryRepository();

    List<Item> inventory = libraryRepository.getInventory();

    public InventoryManager() {
    }


    public List<Item> getInventory() {
        return inventory;
    }

    public void addBook(String title, String ISBN, String author) {
        int randomId = generateRandomId();
        Book book = new Book(randomId, title, ISBN, author);
        inventory.add(book);
    }

    public void addMovie(String title, String IMDb, String director, String genre, int length) {
        int randomId = generateRandomId();
        Movie movie = new Movie(randomId, title, IMDb, director, length);
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

    // Todo: Improve this method
    public Item getItemById(int id) {
        for (Item item : inventory) {
            if (item.getItemId() == id) {
                return item;
            }
        }
        return null;
    }
}
