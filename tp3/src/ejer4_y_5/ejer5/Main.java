package ejer4_y_5.ejer5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();

        while (true) {
            System.out.println("Task Manager");
            System.out.println("1. Add new task");
            System.out.println("2. Show all tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter task priority (higher is better): ");
                    int priority = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    taskList.addTask(new Task(description, priority));
                    System.out.println("Task added successfully.");
                    break;

                case 2:
                    System.out.println("Tasks in descending order of priority:");
                    for (Task task : taskList) {
                        System.out.println(task);
                    }
                    break;

                case 3:
                    System.out.print("Enter the description of the task to remove: ");
                    String taskDescription = scanner.nextLine();
                    taskList.removeTask(taskDescription);
                    System.out.println("Task removed if it existed.");
                    break;

                case 4:
                    System.out.println("Exiting. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }}}