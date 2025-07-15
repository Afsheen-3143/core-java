package String;

import java.util.Arrays;
import java.util.List;
//unkown type of generic
public class Generic4 {
	public static void printlist(List<?>list) {
//		accepts subclass of numbers
//		public static void printlist(List<?extends Number>list) {
		System.out.println(list);
	}
public static void main(String[] args) {
	List<String>names=Arrays.asList("av","rt","at");
	List<Integer>numbers=Arrays.asList(1,2,3);
	printlist(names);
	printlist(numbers);
}
}
