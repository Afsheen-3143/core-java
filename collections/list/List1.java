package lists;
import java.util.*;


public class List1 {
	public static void main(String[] args) {
		int[] arr= new int[]{1,2,3,4,5};
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
			double average=(double)sum / arr.length;
			System.out.println(sum);
			System.out.println(average);
		}
	}



