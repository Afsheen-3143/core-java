package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LIst1 {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>(Arrays.asList(3,2,4,7,1));
//		for (Integer integer : l) {
			System.out.println(l);
//		}
			
//			finding element at index
			int elementfound=2;
			int index=l.indexOf(elementfound);
			if(index!=-1) {
				 System.out.println("Position of element " + elementfound + " is: " + index);
	        } else {
	            System.out.println("Element not found in the list.");
	        }
	    
				
//				System.out.println();
//			
//			l.remove(Integer.valueOf(2));
//			System.out.println(l);
//			
//			
//			System.out.println(l.indexOf(3));
//			
////			asecnding and descending
//			
//			Collections.sort(l);
//			System.out.println(l);
//			
//			Collections.sort(l,Collections.reverseOrder());
//			System.out.println(l);
//			
////			create a sublist
//			List<Integer> list = List.of(10, 23, 31, 40, 50);
//			List<Integer> sub = list.subList(1, 5);  
//			System.out.println(sub);
//			
////			filter list using removeif
//			List<Integer> list1 = new ArrayList<>(List.of(10, 15, 20, 25));
//			list1.removeIf(n -> n % 2 == 0);  // Remove even numbers
//			System.out.println(list1);  
//

		
	}

}
