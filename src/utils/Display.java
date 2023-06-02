package utils;

public class Display {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(String message, boolean newLine) {
        System.out.println(message + (newLine ? "\n" : ""));
    }

}
