package String;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator1 {
	public static void main(String[] args) {
//	Comparator<Integer>comp=new Comparator<Integer>() {
		Comparator<Integer>comp=(Integer x, Integer y)->Integer.compare(x, y);

	
		
		Integer[]arr= {2,3,8,1,9};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
