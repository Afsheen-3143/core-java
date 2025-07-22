package polymorphism2;

//public class Practice4 {
//
//}
//with multiple implementation
interface Notification{
	void notifyuser();
	
}
class SMSnotification implements Notification{
	@Override
	public void notifyuser() {
		System.out.println("Notification sent");
	}
}
class Emailnotification implements Notification{
	public void notifyuser() {
		System.out.println("Notification sent");
	}
}
class Callsnotification implements Notification{
	public void notifyuser() {
		System.out.println("Notification sent");
	}
}

public class Practice4{
	public static void main(String[] args) {
		Notification n=new SMSnotification();
		Notification n1 =new Emailnotification();
		Notification n2=new Callsnotification();
		n.notifyuser();
		n1.notifyuser();
		n2.notifyuser();
		
	}
}