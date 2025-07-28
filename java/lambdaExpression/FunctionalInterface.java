package lambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

	public static void main(String[] args) {
//		Function
//		Function<String,Integer>strlength=s ->s.length();
//		System.out.println(strlength.apply("hello"));

		
//	predicate:used for testing
		Predicate<Integer>even=p->p%2==0;
		System.out.println("iseven"+even.test(32));
		System.out.println("noteven"+even.test(63));
		
//		supplier
		Supplier<String>msg=()->"welcome to java 8";
		System.out.println(msg.get());
		
//		consumer:takes single input and returns no output
		Consumer<String>greet=name->System.out.println("hello"+name);
		greet.accept("Afsheen");
		
	}

}
