package String;

import java.util.ArrayList;
import java.util.List;

public class Generic5 {
	public class AddToList {
	    public static void addNumbers(List<? super Integer> list) {
	        list.add(10);
	        list.add(20);
	    }

	    public static void main(String[] args) {
	        List<Number> numList = new ArrayList<>();
	        addNumbers(numList);
	        System.out.println(numList); // Output: [10, 20]

	        List<Object> objList = new ArrayList<>();
	        addNumbers(objList);
	        System.out.println(objList); // Output: [10, 20]
	    }
	}

}
