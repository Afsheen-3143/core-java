package lists;
import java.util.*;

public class List7 {
	

	
	    public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(1, 8, 0, 5, 1, 6);
	        int elementToFind = 0;

	        int index = list.indexOf(0)+1;
	        if (index != -1) {
	            System.out.println("Position of element " + elementToFind + " is: " + index);
	        } else {
	            System.out.println("Element not found in the list.");
	        }
	    
	    }}

