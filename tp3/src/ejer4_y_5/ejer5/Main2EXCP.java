package ejer4_y_5.ejer5;
import java.util.Scanner;
public class Main2EXCP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();
        boolean i=true;
        while (i==true) {
            try {
                System.out.println("Task Manager");
                System.out.println("1. Add new task");
                System.out.println("2. Show all tasks");
                System.out.println("3. Remove a task");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        System.out.print("Enter task priority (higher is better): ");
                        int priority = Integer.parseInt(scanner.nextLine());
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
                        i=false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }

}


