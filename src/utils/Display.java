package utils;

public abstract class Display {

    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(String message, boolean newLine) {
        System.out.println(message + (newLine ? "\n" : ""));
    }

    public static void spacer() {
        print(generateLine(30));
    }

    //print a string that is always 30 characters long and wraps ═ around the message to add up to 30 characters
    public static void topSpacer(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        int maxLength = 26; // 30 - 2 (" " * 2) * 2 (2 for the ╔ and ╗)
        int messageLength = message.length();
        int paddingLength = Math.max(0, (maxLength - messageLength) / 2);

        stringBuilder.append("╔");
        stringBuilder.append("═".repeat(paddingLength));
        stringBuilder.append(" ").append(message).append(" ");
        stringBuilder.append("═".repeat(maxLength - paddingLength - messageLength));
        stringBuilder.append("╗");

        print(stringBuilder.toString());
    }

    public static void bottomSpacer() {
        print("╚" + generateLine(28) + "╝");
    }

    public static void spacer(String message){
        StringBuilder stringBuilder = new StringBuilder();
        int maxLength = 26; // 30 - 2 (" " * 2) * 2 (2 for the ╔ and ╗)
        int messageLength = message.length();
        int paddingLength = Math.max(0, (maxLength - messageLength) / 2);


        stringBuilder.append("╠");
        stringBuilder.append("═".repeat(paddingLength));
        stringBuilder.append(" ").append(message).append(" ");
        stringBuilder.append("═".repeat(maxLength - paddingLength - messageLength));
        stringBuilder.append("╣");
        print(stringBuilder.toString());
    }

    public static void spacer(boolean isTop) {
        print(isTop ? "╔" + generateLine(28) + "╗" : "╚" + generateLine(28) + "╝");
    }

    private static String generateLine(int count) {
        //String builder to easier add characters to a string
        return "═".repeat(Math.max(0, count));
    }
}
