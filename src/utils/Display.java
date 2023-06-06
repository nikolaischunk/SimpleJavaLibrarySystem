package utils;

public class Display {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(String message, boolean newLine) {
        System.out.println(message + (newLine ? "\n" : ""));
    }

    public static void spacer(){
        print("═══════════════════════════");
    }
    public static void spacer(String message) {
        //print a string that is always 27 characters long and wraps ═ around the message to add up to 27 characters
        //add a space before and after the message
        message = " " + message + " ";
        int messageLength = message.length();
        //TODO: Adjust to 30 not 27 length
        int totalLength = 30;

        // Calculate the number of "=" characters needed on each side
        int equalLength = (totalLength - messageLength) / 2;

        // Print the left padding
        for (int i = 0; i < equalLength; i++) {
            System.out.print("═");
        }

        // Print the message
        System.out.print(message);

        // Print the right padding
        for (int i = 0; i < equalLength; i++) {
            System.out.print("═");
        }
        System.out.println();
    }
    public static void spacer(boolean isTop) {
        print(isTop ? "╔═════════════════════════╗" : "╚═════════════════════════╝", true);
    }

}
