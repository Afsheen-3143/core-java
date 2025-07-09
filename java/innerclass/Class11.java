package innerclass;
// non abstract inner
public class Class11 {
	class inner{
		void display() {
			System.out.println("abstract inner");
		}
	}

}
 class abstractouter{
	public static void main(String[] args) {
		Class11 c=new Class11();
		Class11.inner i= c.new inner();
		i.display();
	}
}