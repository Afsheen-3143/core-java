package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2 {
	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<>(Arrays.asList(4,3,5,2,1));
		List<Integer>l2=new ArrayList<>(Arrays.asList(1,3,7,2,1));
		List<Integer>common=new ArrayList<>();
		for(Integer num:l1) {
			if(l2.contains(num)) {
				common.add(num);
				
			}
		}
		System.out.println(common);
	}

}
