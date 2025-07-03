package lists;

import java.util.Arrays;
import java.util.*;
public class List10 {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(4,2,0,3,2,4,7,8,9,1,1);
	Map<Integer,Integer>countmap=new LinkedHashMap<>();
	for (Integer num : list) {
		countmap.put(num, countmap.getOrDefault(num,0)+1);
		
		
	}
	for(Map.Entry<Integer,Integer>entry:countmap.entrySet()) {
	if(entry.getValue()==1) {
		System.out.println("First non repeating element"+entry.getKey());
		return;
	}}
	System.out.println("No non repeating elements");
}
}
