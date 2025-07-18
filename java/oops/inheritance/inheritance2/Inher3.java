package inheritance2;

class parent{
	parent(){
		System.out.println("parent class");
	}
	void show() {
		System.out.println("parent show method");
	}
	

}
class child extends parent{
	child(){
		super();
		System.out.println("child class");
		
	}
	void show() {
		super.show();
		System.out.println("child show method");
		
	}
}
public class Inher3{
	public static void main(String[] args) {
		child c=new child();
		c.show();
		
	}
}