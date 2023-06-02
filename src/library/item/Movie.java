package library.item;

public class Movie extends Item {
    String IMDb;
    int length;

    public Movie(int id, String title, String IMDb, int length) {
        super(id, title);
        this.IMDb = IMDb;
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
