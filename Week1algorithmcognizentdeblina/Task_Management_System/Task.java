package Task_Management_System;

public class Task {
    private int tId;
    private String tName;
    private String s;
    private Task n;

    public Task(int taskId, String taskName, String status) {
        this.tId = taskId;
        this.tName = taskName;
        this.s = status;
        this.n = null;
    }

    // Getters and setters
    public int getTaskId() {
        return tId;
    }
    public String getTaskName() {
        return tName;
    }
    public String getStatus() {
        return s;
    }
    public Task getNext() {
        return n;
    }
    public void setNext(Task next) {
        this.n = next;
    }

    @Override
    public String toString() {
        return "Task{" + "taskId=" + tId + ", taskName='" + tName + '\'' + ", status='" + s + '\'' + '}';
    }
}
