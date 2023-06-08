package utils;

import java.util.Random;
import java.util.Scanner;

public abstract class Util {
    private Util() {

    }

    public static int generateRandomId() {
        Random rand = new Random();
        return rand.nextInt(99999);
    }

    public static int generateRandomAge() {
        Random rand = new Random();
        return rand.nextInt(60);
    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
