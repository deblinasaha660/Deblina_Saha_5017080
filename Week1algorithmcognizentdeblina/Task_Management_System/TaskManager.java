package Task_Management_System;

public class TaskManager {
    private Task head;

    public TaskManager() {
        this.head = null;
    }

    public void addTask(int taskId, String taskName, String status) {
        Task newTask = new Task(taskId, taskName, status);
        newTask.setNext(head);
        head = newTask;
    }

    public Task searchTask(int taskId) {
        Task current = head;
        while (current != null) {
            if (current.getTaskId() == taskId) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void traverseTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) return;

        if (head.getTaskId() == taskId) {
            head = head.getNext();
            return;
        }

        Task current = head;
        Task prev = null;

        while (current != null && current.getTaskId() != taskId) {
            prev = current;
            current = current.getNext();
        }

        if (current == null) return;

        prev.setNext(current.getNext());
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();

        tm.addTask(1, "Complete project", "In Progress");
        tm.addTask(2, "Review code", "Pending");
        tm.addTask(3, "Update documentation", "Not Started");

        System.out.println("All tasks:");
        tm.traverseTasks();

        Task foundTask = tm.searchTask(2);
        System.out.println("\nFound task: " + foundTask);

        tm.deleteTask(2);
        System.out.println("\nAfter deleting task 2:");
        tm.traverseTasks();
    }
}