package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List4 {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList(Arrays.asList(1,2,3,2,1,9));
		boolean ispalindrome=true;
		for(int i=0;i<l.size()/2;i++) {
			 if (!l.get(i).equals(l.get(l.size() - 1 - i))) {
			
			ispalindrome=false;
			break;
		}}
	
	if (ispalindrome) {
		System.out.println("palindrome");
	}else {
		System.out.println("is not palindrome");
	}

}
}