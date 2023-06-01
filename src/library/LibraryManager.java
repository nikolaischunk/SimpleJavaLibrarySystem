package library;

import repositories.UserRepository;

public class LibraryManager {
    UserRepository userRepository;
    private static LibraryManager instance;

    private LibraryManager() {

    }

    // @ singleton
    public static LibraryManager getInstance() {
        if (instance == null) {
            instance = new LibraryManager();
        }
        return instance;
    }

    public void start(){
        System.out.print("Start");
    }

    /*
        public void borrowItem(Customer customer) {
        borrowHistory.add(customer);
        currentBorrower = customer;
        isAvailable = false;
    }

    public void returnItem() {
        currentBorrower = null;
        isAvailable = true;
    }

    */
}
