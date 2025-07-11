package problemsolving;

import java.util.Scanner;

public class GradeCaluculator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur marks");
		String input=scanner.nextLine();
		int marks=Integer.parseInt(input);
//		calculate grade using switch statement
		String Grade=switch(marks/10) {
		case 10, 9 -> "A+";
        case 8 -> "A";
        case 7 -> "B";
        case 6 -> "C";
        default -> "Fail";
    };

    // Step 4: Display the result
    System.out.println("Your Grade: " + Grade);
		}
	}


