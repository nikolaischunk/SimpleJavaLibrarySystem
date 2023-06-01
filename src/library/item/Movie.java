package library.item;

public class Movie extends Item {
    String IMDb;
    int length;

    public Movie(String title, String IMDb, int length) {
        super(title);
        this.IMDb = IMDb;
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
