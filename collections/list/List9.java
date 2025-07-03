package lists;
import java.util.*;
public class List9 {
	public static void main(String[] args) {
//		removing similar elements
		List<Integer>list1=Arrays.asList(5,3,4,9,0,1);
//		List<Integer>list2=Arrays.asList(7,6,4,9,0,1);
//		List<Integer> list1 = Arrays.asList(4, 9, 8);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 1, 9, 4, 8, 0, 5, 1, 8, 6));
		list2.removeIf(list1::contains);
		System.out.println(list2);
	


//reverse of a list
Collections.reverse(list1);
System.out.println("reverse of list"+list1);
//ascending
Collections.sort(list1);
System.out.println(list1);
list1.sort(Collections.reverseOrder());
System.out.println(list1);
}}