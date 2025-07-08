package innerclass;

public  class Class10 {
//anonymous abstract class
	public static void main(String[] args) {
		Abstractclass a=new Abstractclass() {
			public void show() {
			System.out.println("show abstract class");
			}
			public void print() {
			System.out.println("print abstract class");

		}
		};
		a.show();
		a.print();

	}

}
