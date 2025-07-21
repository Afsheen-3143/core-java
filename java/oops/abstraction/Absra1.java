package abstraction;


	// Abstract class example
	abstract class Animal {
	    // Abstract method (no implementation)
	    public abstract void makeSound();
	    
	    // Concrete method
	    public void eat() {
	        System.out.println("This animal eats food");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Bark bark!");
	    }
	}

	class Cat extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Meow!");
	    }
	}

	public class Absra1 {
		public static void main(String args[]) {
			
		
	// Usage
	Animal myDog = new Dog();
	myDog.makeSound();  // Output: Bark bark!
	myDog.eat();       // Output: This animal eats food
		}
}
