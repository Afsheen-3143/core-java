package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream3 {
	public static void main(String[] args) {
//		count

//	List<Integer>l=Arrays.asList(2,1,1,4,4,6);
//	long count=l.stream()
//			.filter(n->n>1)
//			.count();
//	System.out.println(count);
//	
	
//	distinct
//	List<Integer>unique=l.stream()
//	.distinct()
//	.collect(Collectors.toList());
//	
//System.out.println(unique);


//returning first element

//Optional<Integer>first=l.stream().findFirst();
//first.ifPresent(System.out::println);

//joining the words

		List<String>l=Arrays.asList("java","python","sql");
//		String result=l.stream() 
//				.collect(Collectors.joining(" "));
//		System.out.println(result);
		
//		group strings by length
		
//		Map<Integer, List<String>>result=l.stream()
//				.collect(Collectors.groupingBy(String::length));
//		System.out.println(result);
		
//		sum of the numbers
		
	
//	int sum=l.stream()
//			.reduce(0, Integer::sum);
//	System.out.println(sum);
	
//	peek for debugging
	
	
	List<String>result=l.stream()
			.peek(System.out::println)
			.map(String::toUpperCase)
			.collect(Collectors.toList());
	System.out.println(result);
	
}
}
