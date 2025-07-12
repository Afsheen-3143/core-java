package String;

public class Final {

	public final static void main(String[] args) {
		final int a=11;
//		it ca be overidden a=10;
		System.out.println(a);
		 // Calling methods using objects
        parent p = new parent();
        p.display();

        // You can't extend Vehicle, but you can use it
        Vehicle v = new Vehicle();
        v.run();
		

	}
	static class parent{
	final void display() {
		System.out.println("display");
	}
		
	}
	static class child extends parent{
//		void display() { cannot use final method in another class
			
		
	}

}
final class Vehicle {
    void run() {
        System.out.println("Running...");
    }
}

//class Car extends Vehicle { //  Error: cannot inherit from final class

