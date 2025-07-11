package String;
import java.util.ArrayList;

public class WC2 {
	

	
	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(100); // Autoboxing
	        list.add(200);

	        int val = list.get(1); // Unboxing
	        System.out.println("First value: " + val);
	    }
	}



