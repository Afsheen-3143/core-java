package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map4 {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 3, 2, 3, 4, 1, 5};

	        Map<Integer, Integer> freq = new HashMap<>();

	        for (int num : arr) {
	            freq.put(num, freq.getOrDefault(num, 0) + 1);
	        }

	        System.out.println("Duplicates:");
	        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
	            }
	        }
	    }
	}



