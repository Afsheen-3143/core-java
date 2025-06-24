package methodoverriding;

public class subraction {
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	public void sub(int a, double b) {
		System.out.println(a-b);
	}
	public void sub(float a, int b) {
		System.out.println(a-b);
	}
	public void sub(double a, int b) {
		System.out.println(a-b);
	}
	public void sub(int a, int b, int c) {
		System.out.println(a-b-c);
	}

}
