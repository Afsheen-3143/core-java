package polymorphism2;

//public class Practice3 {
//	
//
//}
//method overriding
class vehicle{
	void start() {
		System.out.println("Start the vehicle");
	}
	
}
class Bike extends vehicle{
	void start(){
		System.out.println("start the bike");
	}
}
class car extends Bike{
	
	void start() {
		super.start();
		System.out.println("start the car");
	}
}
public class Practice3{
	public static void main(String[] args) {
		vehicle v=new Bike();
		vehicle c=new car();
		v.start();
		c.start();
	}
}