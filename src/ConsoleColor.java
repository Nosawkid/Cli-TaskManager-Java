public class ConsoleColor {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static void printRed(String message) {
        System.out.println(RED + message + RESET);
    }

    public static void printGreen(String message) {
        System.out.println(GREEN + message + RESET);
    }

    public static void printYellow(String message) {
        System.out.println(YELLOW + message + RESET);
    }

    public static void printBlue(String message) {
        System.out.println(BLUE + message + RESET);
    }
}
