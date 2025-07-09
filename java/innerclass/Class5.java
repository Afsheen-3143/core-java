package innerclass;
//static class
public class Class5 {
	static class Nested{
		void display() {
			System.out.println("static class");
		}
	}

}
class staticNestedExample{
	public static void main(String[] args) {
		Class5.Nested S=new Class5.Nested();
		S.display();
	}
}