package problemsolving;

public class SwitchExp {
	public static void main(String[] args) {
		int marks=60;
	String Grade=switch(marks/10) {
		case 10,9->"A+";
		case 8->"A";
		case 7->"B";
		case 6->{
			System.out.println("you just passed");
			yield "c";
		}
	
	default -> throw new IllegalArgumentException("Unexpected value: " + marks/10);
	};
	System.out.println("results"+Grade);
	}

}
