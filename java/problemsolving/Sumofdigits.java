package problemsolving;
import java.util.ArrayList;
public class Sumofdigits {
	


	    public static void main(String[] args) {
	        ArrayList<String> numbers = new ArrayList<>();
	        numbers.add("123");
	        numbers.add("456");
	        numbers.add("789");

	        int totalSum = 0;

	        for (String numStr : numbers) {
	            // Convert string to Integer using wrapper method
	            int num = Integer.parseInt(numStr);

	            // Convert each number to characters, then extract digits
	            for (char digitChar : numStr.toCharArray()) {
	                int digit = Character.getNumericValue(digitChar); // Wrapper method
	                totalSum += digit;
	            }
	        }

	        System.out.println("Sum of all digits = " + totalSum);
	    }
	}


