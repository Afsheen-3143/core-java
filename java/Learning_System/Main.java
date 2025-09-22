package LearningSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CourseManager cm = new CourseManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Course Management System ---");
            System.out.println("1. SubjectArea");
            System.out.println("2. Course");
            System.out.println("3. Chapter");
            System.out.println("4. Topic");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    subjectMenu(cm, sc);
                    break;
                case 2:
                    courseMenu(cm, sc);
                    break;
                case 3:
                    chapterMenu(cm, sc);
                    break;
                case 4:
                    topicMenu(cm, sc);
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // -------- SubjectArea Menu --------
    private static void subjectMenu(CourseManager cm, Scanner sc) {
        while (true) {
            System.out.println("\n--- SubjectArea Menu ---");
            System.out.println("1. Add SubjectArea");
            System.out.println("2. View SubjectAreas");
            System.out.println("3. Update SubjectArea");
            System.out.println("4. Delete SubjectArea");
            System.out.println("5. Back");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter SubjectArea ID: ");
                    int subID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter SubjectArea Name: ");
                    String subName = sc.nextLine();
                    cm.addSubject(subID, subName);
                    break;
                case 2:
                    cm.viewSubjects();
                    break;
                case 3:
                    System.out.print("Enter SubjectArea ID: ");
                    int subId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    cm.updateSubject(sc.nextLine(), subId);
                    break;
                case 4:
                    System.out.print("Enter SubjectArea ID: ");
                    cm.deleteSubject(sc.nextInt());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // -------- Course Menu --------
    private static void courseMenu(CourseManager cm, Scanner sc) {
        while (true) {
            System.out.println("\n--- Course Menu ---");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Course");
            System.out.println("5. Back");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Course ID: ");
                    int cId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String cName = sc.nextLine();
                    System.out.print("Enter SubjectArea ID: ");
                    int sId = sc.nextInt();
                    cm.addCourse(cId, cName, sId);
                    break;
                case 2:
                    cm.viewCourses();
                    break;
                case 3:
                    System.out.print("Enter Course ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Course Name: ");
                    cm.updateCourse(sc.nextLine(), cid);
                    break;
                case 4:
                    System.out.print("Enter Course ID: ");
                    cm.deleteCourse(sc.nextInt());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // -------- Chapter Menu --------
    private static void chapterMenu(CourseManager cm, Scanner sc) {
        while (true) {
            System.out.println("\n--- Chapter Menu ---");
            System.out.println("1. Add Chapter");
            System.out.println("2. View Chapters");
            System.out.println("3. Update Chapter");
            System.out.println("4. Delete Chapter");
            System.out.println("5. Back");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Chapter ID: ");
                    int chId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Chapter Name: ");
                    String chName = sc.nextLine();
                    System.out.print("Enter Course ID: ");
                    int courseId = sc.nextInt();
                    cm.addChapter(chId, chName, courseId);
                    break;
                case 2:
                    cm.viewChapters();
                    break;
                case 3:
                    System.out.print("Enter Chapter ID: ");
                    int chid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Chapter Name: ");
                    cm.updateChapter(sc.nextLine(), chid);
                    break;
                case 4:
                    System.out.print("Enter Chapter ID: ");
                    cm.deleteChapter(sc.nextInt());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // -------- Topic Menu --------
    private static void topicMenu(CourseManager cm, Scanner sc) {
        while (true) {
            System.out.println("\n--- Topic Menu ---");
            System.out.println("1. Add Topic");
            System.out.println("2. View Topics");
            System.out.println("3. Update Topic");
            System.out.println("4. Delete Topic");
            System.out.println("5. Back");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Topic ID: ");
                    int tId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Topic Name: ");
                    String tName = sc.nextLine();
                    System.out.print("Enter Chapter ID: ");
                    int chapId = sc.nextInt();
                    cm.addTopic(tId, tName, chapId);
                    break;
                case 2:
                    cm.viewTopics();
                    break;
                case 3:
                    System.out.print("Enter Topic ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Topic Name: ");
                    cm.updateTopic(sc.nextLine(), tid);
                    break;
                case 4:
                    System.out.print("Enter Topic ID: ");
                    cm.deleteTopic(sc.nextInt());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
