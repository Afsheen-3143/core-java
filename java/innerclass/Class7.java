package innerclass;

import innerclass.Class1.classa;
//local classes that inside main method
public class Class7 {
	private String S="hi";

	public static void main(String[] args) {
		Class7 c=new Class7();
		System.out.println(c.S);
		int id=101;
		class a {
			public void Show() {
				System.out.println("print the string"+id);	
		}}
		a A=new a();
		A.Show();
	}
	
public void print() {
	System.out.println("print the string"+S);
}
}
