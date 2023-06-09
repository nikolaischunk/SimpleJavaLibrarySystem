package library.item;

import static utils.Display.print;

public class Movie extends Item {
    String IMDb;
    String director;
    int length;

    public Movie(int id, String title, String IMDb, String director, int length) {
        super(id, title);
        this.director = director;
        this.IMDb = IMDb;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String getIMDb() {
        return IMDb;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String getItemType() {
        return "Movie";
    }

    public String toString() {
        return "Movie: " + getTitle() + " by " + getDirector();
    }

    public void displayItem(boolean detailed) {
        super.displayItem(detailed);
        print("Length: " + length);
        if (detailed) print("IMDb: " + IMDb);
    }
}
