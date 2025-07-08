package lambdaExpression;

public class ClassA {
	public static void main(String[] args) {
		Audi a= new Audi() ;
		a.drive(50);	
		car c1=new car(){

			@Override
			public void drive(int speed) {
			System.out.println("drive bmw");
				
			}
			
		};
		c1.drive(50);
//		anonymous class
		car c2=(int speed)->{
//		speed with the parameters
			
			System.out.println("speed of the car is"+speed);
		};
		
		c2.drive(100);
	}

}
class Audi implements car{
	public void drive(int speed) {
		System.out.println("drive the audi");
		
	}
}
@FunctionalInterface
interface car{
	public void drive(int speed); 
		
	
	
}