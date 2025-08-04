package problemsolving;


	import java.io.FileWriter;
	import java.io.IOException;
	import java.time.LocalDate;
	import java.util.ArrayList;
	import java.util.Scanner;

	class Task {
	    private String name;
	    private LocalDate dueDate;

	    public Task(String name, LocalDate dueDate) {
	        this.name = name;
	        this.dueDate = dueDate;
	    }

	    public String toString() {
	        return name + " (Due: " + dueDate + ")";
	    }
	}

	public class ToDoListmanager {

	    private static ArrayList<Task> taskList = new ArrayList<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        System.out.println("=== TO-DO LIST MANAGER ===");

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add Task");
	            System.out.println("2. Delete Task");
	            System.out.println("3. View All Tasks");
	            System.out.println("4. Save to File");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    addTask(scanner);
	                    break;
	                case 2:
	                    deleteTask(scanner);
	                    break;
	                case 3:
	                    viewTasks();
	                    break;
	                case 4:
	                    saveTasksToFile();
	                    break;
	                case 0:
	                    System.out.println("Exiting To-Do List Manager.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }

	        } while (choice != 0);

	        scanner.close();
	    }

	    // 1️⃣ Add Task
	    private static void addTask(Scanner scanner) {
	        System.out.print("Enter task name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter due date (YYYY-MM-DD): ");
	        String dateInput = scanner.nextLine();

	        try {
	            LocalDate dueDate = LocalDate.parse(dateInput);
	            taskList.add(new Task(name, dueDate));
	            System.out.println("Task added successfully!");
	        } catch (Exception e) {
	            System.out.println("Invalid date format. Task not added.");
	        }
	    }

	    // 2️⃣ Delete Task
	    private static void deleteTask(Scanner scanner) {
	        viewTasks();
	        System.out.print("Enter task number to delete: ");
	        int index = scanner.nextInt();

	        if (index >= 1 && index <= taskList.size()) {
	            Task removed = taskList.remove(index - 1);
	            System.out.println("Task '" + removed + "' deleted.");
	        } else {
	            System.out.println("Invalid task number!");
	        }
	    }

	    // 3️⃣ View All Tasks
	    private static void viewTasks() {
	        if (taskList.isEmpty()) {
	            System.out.println("No tasks available.");
	        } else {
	            System.out.println("\nCurrent Tasks:");
	            for (int i = 0; i < taskList.size(); i++) {
	                System.out.println((i + 1) + ". " + taskList.get(i));
	            }
	        }
	    }

	    // 4️⃣ Save Tasks to File
	    private static void saveTasksToFile() {
	        try (FileWriter writer = new FileWriter("./tasks.txt")) {
	            for (Task task : taskList) {
	                writer.write(task.toString() + "\n");
	            }
	            System.out.println("Tasks saved to tasks.txt");
	        } catch (IOException e) {
	            System.out.println("Error saving tasks: " + e.getMessage());
	        }
	    }
	}



