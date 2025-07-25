package Collection;

import java.util.Arrays;
import java.util.List;

public class List3 {
	public static void main(String[] args) {
		
	
	List<Integer> list = Arrays.asList(1, 8, 0, 5, 1, 6);
	for(Integer even:list) {
		if(even%2==0) {
			System.out.println(even);
		}
		
	}

}
}