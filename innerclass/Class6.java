package innerclass;
//
public class Class6 {
abstract class AbstractInner {
	abstract void display();
}
	void show() {
		AbstractInner inner = new AbstractInner() {
			void display() {
				System.out.println("abstract class");
			}
		
	};
	inner.display();
}
}
class Test {
	public static void main(String[] args) {
		Class6 c=new Class6();
		c.show();
	}
}