package innerclass;

public class Class8 {
//	anonymous class 
	public static void main(String[] args) {
		int salary=5000;
		b ab=new b() {
		public void print() {
			System.out.println("print salary"+salary);
		}};
	ab.show();
	ab.print();
}}
	class b{
		public void show() {
			System.out.println("print the show method");
		}
		public void print() {
			System.out.println("print");
		}
	}


