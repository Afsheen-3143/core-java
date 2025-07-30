package lambdaExpression;

import java.util.Optional;

public class OptionalClass6 {
	public static void main(String[] args) {
//		String name="Affu";
//		Optional<String>optionalname=Optional.ofNullable(name);
//		String name1=optionalname.orElse("default");
//		
//		System.out.println(name1);

		
//		using ispresent
		Optional<String> name= Optional.of("Afsheen");
		name.ifPresent(n->System.out.println("name"+n));

//		if(name.isPresent()) {
//			System.out.println("name"+name.get());
//		}else {
//			System.out.println("no name");
//		}
	}

}
