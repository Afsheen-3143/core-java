package unchecked;

public class File8 {
    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // Method that uses 'throw' to create an exception
    static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18+");
        }
        System.out.println("Age is valid");
    }
}