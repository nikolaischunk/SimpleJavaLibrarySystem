import library.LibraryManager;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
        LibraryManager libraryManager = LibraryManager.getInstance();
        libraryManager.start();
    }
}