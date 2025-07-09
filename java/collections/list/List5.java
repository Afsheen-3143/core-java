package lists;
import java.util.*;

public class List5 {
	public static void main(String[] args) {
		List<Integer>list1= Arrays.asList(4,0,1,5,3);
		List<Integer>list2=Arrays.asList(6,2,4,0,1);
		List<Integer>common = new ArrayList<>();
		for (Integer num : list1) {
			if(list2.contains(num)) {
				common.add(num);
			}
			
		}
		System.out.println(common);
	}

}
