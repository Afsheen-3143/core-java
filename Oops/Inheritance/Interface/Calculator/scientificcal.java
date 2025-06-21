package interfac;

public class scientificcal implements cal4{
	public void add() {
		System.out.println("addition");
	}
	public void sub() {
		
	System.out.println("subraction");
	}
	public void mod() {
		System.out.println("modulatoin");
	}
	public void div() {
		System.out.println("division");
	}
	public void log() {
		System.out.println("logarthemic");
	}
	public void sin() {
		System.out.println("sine");
	}
public static void main(String args[]) {
	scientificcal cal = new scientificcal();
	cal.add();
	cal.sub();
	cal.div();
	cal.mod();
	cal.log();
	cal.sin();
}
}
