import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void setTaks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Task> geTasks() {
        return tasks;
    }

    public void addTask(String taskName) {
        Task task = new Task(taskName);
        tasks.add(task);
    }

    public void addTask(int n, String taskName) {
        Task task = new Task(taskName);
        tasks.add(n, task);
    }

    public void removeTask(int n) {
        try {
            tasks.remove(n);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No task found at this position");
        }
    }

    public void updateTask(int pos, String taskName) {
        Task taksToUpdate = tasks.get(pos);
        taksToUpdate.setTaskName(taskName);
        tasks.set(pos, taksToUpdate);
    }

    public void markDone(int pos) {
        try {
            Task task = tasks.get(pos);
            task.setTaskStatus(2);
            tasks.set(pos, task);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No task at this position");
        }
    }

    public void markInProgress(int pos) {
        try {
            Task task = tasks.get(pos);
            task.setTaskStatus(1);
            tasks.set(pos, task);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No task at this position");
        }
    }

    public void listDoneTasks() {
        int i = 0;
        for (Task task : tasks) {
            if (task.getTaskStatus() == 2) {
                ConsoleColor.printBlue("Task Number: " + i);
                ConsoleColor.printBlue("Task Name: " + task.getTaskName());
                ConsoleColor.printBlue("Task Status: Done");
                System.out.println("-------------------------------------------");
            }
            i++;
        }
    }

    public void listInProgress() {
        int i = 0;
        for (Task task : tasks) {
            if (task.getTaskStatus() == 1) {
                ConsoleColor.printBlue("Task Number: " + i);
                ConsoleColor.printBlue("Task Name: " + task.getTaskName());
                ConsoleColor.printBlue("Task Status: In Progress");
                System.out.println("-------------------------------------------");
            }
            i++;
        }
    }

    public void listNotDone() {
        int i = 0;
        for (Task task : tasks) {
            if (task.getTaskStatus() == 0) {
                ConsoleColor.printBlue("Task Number: " + i);
                ConsoleColor.printBlue("Task Name: " + task.getTaskName());
                ConsoleColor.printBlue("Task Status: Not Done");
                System.out.println("-------------------------------------------");
            }
            i++;
        }
    }

    private String checkStatus(Task task) {
        int status = task.getTaskStatus();

        if (status == 1) {
            return "In Progress";
        }

        if (status == 2) {
            return "Done";
        }

        return "Not Done";
    }

    public void listAll() {
        int i = 0;
        for (Task task : tasks) {
            ConsoleColor.printBlue("Task Number: " + i);
            ConsoleColor.printBlue("Task Name: " + task.getTaskName());
            ConsoleColor.printBlue("Task Status: " + checkStatus(task));
            System.out.println("-------------------------------------------");
            i++;
        }
    }

}
