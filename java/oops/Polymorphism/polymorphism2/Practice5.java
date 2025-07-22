package polymorphism2;

class messege{
	messege(){
		System.out.println("default msg");
	}
	messege (String msg){
		System.out.println("read msg "+msg);
	}
	void print() {
		System.out.println("print msg");
	}
	void print(String Tag) {
		System.out.println("tag msg"+Tag);
	}
}
class mail extends messege{
	mail(String msg){
		super.print();
		
	}
	void print() {
		System.out.println("mail notif");
	}
}
public class Practice5{
	public static void main(String[] args) {
		messege m=new mail("hi");
		m.print();
		m.print("444");
	}
}