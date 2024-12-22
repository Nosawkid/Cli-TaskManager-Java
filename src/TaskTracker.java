import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CommandExecuter executer = new CommandExecuter();

        executer.executeCommands(sc);

        sc.close();
    }
}