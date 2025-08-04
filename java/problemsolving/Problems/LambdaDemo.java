package problemsolving;


	@FunctionalInterface
	interface MathOperation {
	    int operate(int a, int b);
	}

	public class LambdaDemo {
	    public static void main(String[] args) {

	        // Lambda expression for addition
	        MathOperation add = (a, b) -> a + b;

	        // Lambda expression for subtraction
	        MathOperation subtract = (a, b) -> a - b;

	        // Lambda expression for multiplication
	        MathOperation multiply = (a, b) -> a * b;

	        // Lambda expression for division (with check for divide-by-zero)
	        MathOperation divide = (a, b) -> {
	            if (b == 0) {
	                System.out.println("Division by zero is not allowed.");
	                return 0;
	            }
	            return a / b;
	        };

	        // Sample input
	        int x = 20, y = 10;

	        // Performing operations
	        System.out.println("Addition: " + add.operate(x, y));
	        System.out.println("Subtraction: " + subtract.operate(x, y));
	        System.out.println("Multiplication: " + multiply.operate(x, y));
	        System.out.println("Division: " + divide.operate(x, y));
	    }
	}



