package lambdaExpression;

import java.util.Optional;

public class OptionalClass3 {
	public static void main(String[] args) {
		Optional<Integer>age=Optional.ofNullable(15);
		age.filter(a->a>=18)
		.ifPresent(a->System.out.println("u r the adult"));
	}

}
