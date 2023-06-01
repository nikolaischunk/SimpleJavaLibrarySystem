package utils;

import java.util.Random;

public class Util {
private Util () {

}
    public static int generateRandomId() {
        Random rand = new Random();
        return rand.nextInt(99999);
    }
}
