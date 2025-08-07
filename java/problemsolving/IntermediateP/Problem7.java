package IntermediateP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    String title;
    boolean iscompleted;

    public Task(String title) {
        this.title = title;
        this.iscompleted = false; // default status
    }

    public void togglestatus() {
        iscompleted = !iscompleted;
    }

    public String toString() {
        return (iscompleted ? "[✔] " : "[ ] ") + title;
    }
}

public class Problem7 {
    static List<Task> TaskList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n---- To-Do List ----");
            System.out.println("1. View All Tasks");
            System.out.println("2. Add Task");
            System.out.println("3. Edit Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Toggle Status");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1 -> viewtask();
                case 2 -> addtask();
                case 3 -> edittask();
                case 4 -> deletetask();
                case 5 -> togglestatus();
                case 6 -> {
                    exit();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void exit() {
        System.out.println("Thank you for using To-Do App!");
    }

    private static void togglestatus() {
        viewtask();
        System.out.print("Enter task number to toggle: ");
        int index = sc.nextInt() - 1;

        if (index >= 0 && index < TaskList.size()) {
            TaskList.get(index).togglestatus();
            System.out.println("Task status updated.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void deletetask() {
        viewtask();
        System.out.print("Enter task number to delete: ");
        int index = sc.nextInt() - 1;

        if (index >= 0 && index < TaskList.size()) {
            TaskList.remove(index);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void edittask() {
        viewtask();
        System.out.print("Enter task number to edit: ");
        int index = sc.nextInt() - 1;
        sc.nextLine(); // consume newline

        if (index >= 0 && index < TaskList.size()) {
            System.out.print("Enter new title: ");
            String newtitle = sc.nextLine();
            TaskList.get(index).title = newtitle;
            System.out.println("Task updated.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void addtask() {
        System.out.print("Enter task title: ");
        String title = sc.nextLine();
        TaskList.add(new Task(title));
        System.out.println("Task added.");
    }

    private static void viewtask() {
        if (TaskList.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("\nYour Tasks:");
            for (int i = 0; i < TaskList.size(); i++) {
                System.out.println((i + 1) + ". " + TaskList.get(i));
            }
        }
    }
}
