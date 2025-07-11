package String;

public class TOperator3 {
	public static void main(String[] args) {
		int a=100;
		int b=10;
		int c=88;
		String result=(a>b)?"A is greatest":
			(b>c)?"B is greatest":
				"c is greatest";
		System.out.println(result);
	}

}
