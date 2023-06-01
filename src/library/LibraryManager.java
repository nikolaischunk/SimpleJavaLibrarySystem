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

}
