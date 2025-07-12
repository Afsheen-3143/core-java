package String;


	// Final class - cannot be extended
	final class FinalClass {
	    void showMessage() {
	        System.out.println("This is a final class method.");
	    }
	}

	// Regular class demonstrating static, final, and static final
	public class FinalStaticExample {

	    // static variable
	    static int staticCounter = 0;

	    // final variable (must be initialized once)
	    final int finalId;

	    // static final variable (constant)
	    static final String COMPANY_NAME = "OpenAI";

	    // Constructor to assign value to final variable
	    FinalStaticExample(int id) {
	        finalId = id;
	    }

	    // static method
	    static void printStaticMessage() {
	        System.out.println("Static method called.");
	    }

	    // final method - cannot be overridden
	    final void printFinalMessage() {
	        System.out.println("Final method called.");
	    }

	    public static void main(String[] args) {
	        // Accessing static final variable
	        System.out.println("Company Name: " + COMPANY_NAME);

	        // Accessing static variable
	        staticCounter++;
	        System.out.println("Static Counter: " + staticCounter);

	        // Creating object to access instance (non-static) members
	        FinalStaticExample obj = new FinalStaticExample(101);
	        System.out.println("Final ID: " + obj.finalId);

	        // Calling methods
	        printStaticMessage();
	        obj.printFinalMessage();

	        // Using final class
	        FinalClass fc = new FinalClass();
	        fc.showMessage();
	    }
	}



