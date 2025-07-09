package problemsolving;

import java.util.ArrayList;
import java.util.List;

public class Shoppingcart {
	
	    public static void main(String[] args) {
	        List<String> shoppingList = new ArrayList<>();
	        shoppingList.add("Milk");
	        shoppingList.add("Bread");
	        shoppingList.add("Eggs");

	        // Remove an item
	        shoppingList.remove("Bread");

	        // Display final list
	        System.out.println("Shopping List:");
	        for (String item : shoppingList) {
	            System.out.println("- " + item);
	        }
	    }
	}



