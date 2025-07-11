package String;

public class SwitchExpression {

	public static void main(String[] args) {
		int a=12;
		String result ="";
//		switch statement
		result=switch(Integer.compare(a, 0)){
		case 1->("postive");
		case 2->("Negative");
		case 3->("zero");
		default -> throw new IllegalArgumentException("Unexpected value: " + Integer.compare(a, 0));
		
		
		};
		System.out.println("the number"+a+"is"+result);
//		switch case
		switch(Integer.compare(a, 0)){
		case 1:System.out.println("postive");
		break;
		case 2:System.out.println("Negative");
		break;
		case 3:System.out.println("zero");
		break;
		}

	}

}
