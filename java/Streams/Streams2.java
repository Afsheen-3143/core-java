package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams2 {
	public static void main(String[] args) {
//		List<Integer> l = Arrays.asList("affu");
//
//		List<Integer> evens = l.stream()
//		    .filter(n->n%2==0)
////		    .collect(Collectors.toList());
////
////		System.out.println(evens); // Output: [2, 4, 6]
//
////		use map for condition
//		.map(String::toUpperCase)
//		 .collect(Collectors.toList());
		
		List<String> names = Arrays.asList("afs", "rahul", "anu");

		List<String> upper = names.stream()
		    .map(String::toUpperCase)
		    .collect(Collectors.toList());

		System.out.println(upper); // Output: [AFS, RAHUL, ANU]

	}

}
