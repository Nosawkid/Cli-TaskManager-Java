import java.util.Scanner;

public class CommandExecuter {
    public enum Commands {
        ADD,
        UPDATE,
        DELETE,
        MARK_DONE,
        MARK_IN_PROGRESS,
        LIST_DONE,
        LIST_IN_PROGRESS,
        LIST_NOT_DONE,
        LIST_ALL,
        EXIT
    }

    private TaskManager taskManager;

    public CommandExecuter() {
        taskManager = new TaskManager();
    }

    private String extractAttribute(int pos, String[] commandLine) {
        String attributes = "";
        for (int i = pos; i < commandLine.length; i++) {
            attributes += commandLine[i] + " ";
        }
        return attributes;
    }

    private boolean checkAttribute(String attribute) {
        if (attribute.trim().isEmpty()) {
            ConsoleColor.printRed("No Attribute found !");
            return false;
        }
        return true;
    }

    public void executeCommands(Scanner scanner) {
        boolean running = true;
        while (running) {
            ConsoleColor.printYellow("Enter the command !");
            String userInput = scanner.nextLine();
            String[] commandLine = userInput.split(" ");
            String command = commandLine[0].trim().toUpperCase();
            String attributes = extractAttribute(1, commandLine);

            try {
                Commands cd = Commands.valueOf(command);
                switch (cd) {
                    case ADD:
                        if (checkAttribute(attributes)) {
                            taskManager.addTask(attributes);
                            ConsoleColor.printGreen("Task added successfully");
                            break;
                        }
                        break;
                    case UPDATE:
                        if (checkAttribute(attributes)) {
                            String[] attributeLine = attributes.split(" ");
                            int pos = Integer.parseInt(attributeLine[0]);
                            String textToUpdate = extractAttribute(1, attributeLine);
                            try {
                                taskManager.geTasks().get(pos);
                            } catch (IndexOutOfBoundsException e) {
                                ConsoleColor.printYellow("No Task at this position");
                                taskManager.addTask(textToUpdate);
                                ConsoleColor.printYellow("Task has added to the end of the list");
                                break;
                            }
                            taskManager.updateTask(pos, textToUpdate);
                            ConsoleColor.printGreen("Task updated successfully");
                            break;
                        }
                        break;
                    case DELETE:
                        if (checkAttribute(attributes)) {
                            String[] attributeLine = attributes.split(" ");
                            int pos = Integer.parseInt(attributeLine[0].trim());
                            taskManager.removeTask(pos);
                            ConsoleColor.printGreen("Task deleted successfully");
                        }
                        break;
                    case MARK_DONE:
                        if (checkAttribute(attributes)) {
                            String[] attributeLine = attributes.split(" ");
                            int pos = Integer.parseInt(attributeLine[0].trim());
                            taskManager.markDone(pos);
                            ConsoleColor.printGreen("Marked done !");
                            break;
                        }
                        break;
                    case MARK_IN_PROGRESS:
                        if (checkAttribute(attributes)) {
                            String[] attributeLine = attributes.split(" ");
                            int pos = Integer.parseInt(attributeLine[0].trim());
                            taskManager.markInProgress(pos);
                            ConsoleColor.printGreen("Marked in progress !");
                            break;
                        }
                        System.out.println("Mark In Progress");
                        break;
                    case LIST_DONE:
                        taskManager.listDoneTasks();
                        break;
                    case LIST_IN_PROGRESS:
                        taskManager.listInProgress();
                        break;
                    case LIST_NOT_DONE:
                        taskManager.listNotDone();
                        break;
                    case LIST_ALL:
                        taskManager.listAll();
                        break;
                    case EXIT:
                        running = false;
                        System.out.println("Exiting the app...");
                        break;
                    default:
                        System.out.println("Invalid command");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("No command found");
            }

        }
    }
}
