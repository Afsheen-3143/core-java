package lists;

import java.util.ArrayList;
import java.util.List;
//splitting two arrayLists
public class List3 {
	public static void main(String[] args) {
		int[]arr= {4,3,7,8,2};
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length/2) {
				l1.add(arr[i]);
				
			}else {
				l2.add(arr[i]);
				
			}
			
		}
		System.out.println(l1);
		System.out.println(l2);
		//merging two lists
		List<Integer> merged=new ArrayList<>(l1);
		
		merged.addAll(l2);
		System.out.println(merged);
	}

}
