import java.util.Scanner;

public class TaskManager {
    private static TaskList taskList = new TaskList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            printMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    markTaskCompleted();
                    break;
                case 4:
                    listTasks();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("1. Add task");
        System.out.println("2. Remove task");
        System.out.println("3. Mark task completed");
        System.out.println("4. List tasks");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        taskList.addTask(description);
    }

    private static void removeTask() {
        System.out.print("Enter task index to remove: ");
        int index = Integer.parseInt(scanner.nextLine());
        taskList.removeTask(index);
    }

    private static void markTaskCompleted() {
        System.out.print("Enter task index to mark completed: ");
        int index = Integer.parseInt(scanner.nextLine());
        taskList.markTaskCompleted(index);
    }

    private static void listTasks() {
        taskList.listTasks();
    }
}
