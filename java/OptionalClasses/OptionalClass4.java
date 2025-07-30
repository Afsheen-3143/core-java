package lambdaExpression;

import java.util.Optional;

public class OptionalClass4 {
	public static void main(String[] args) {
		String value=null;
//		String result1=Optional.ofNullable(value).orElse("default value");
//		String result2=Optional.ofNullable(value).orElseGet(()->"generated value");
		 String result = Optional.ofNullable(value)
                 .orElseThrow(() -> new IllegalArgumentException("Value is required"));
		System.out.println(result);
//		System.out.println(result2);
	}

}
