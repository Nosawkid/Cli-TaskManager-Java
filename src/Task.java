public class Task {

    private String taskName;
    private int taskStatus;

    public Task(String taskName) {
        this.taskName = taskName;
        this.taskStatus = 0;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskStatus(int status) {
        this.taskStatus = status;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTaskStatus() {
        return taskStatus;
    }

}
