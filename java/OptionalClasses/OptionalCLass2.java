package lambdaExpression;

import java.util.Optional;

public class OptionalCLass2 {
	public static void main(String[] args) {
		String name="affu";
		Optional<String>Optionalname=Optional.ofNullable(name);
		String upper=Optionalname.map(String::toUpperCase).orElse("defauit");
		System.out.println(upper);
//		String demo = ifPresent(n->System.out.println("uppercase : "+n).orElse("defauit"));
//		if(Optionalname.isPresent()) {
//			System.out.println(Optionalname.get());
//		}else {
//				System.out.println("not executed");
//			}
		
//		        Optional<String> name = Optional.of("java");
//
//		        name.ifPresent(n -> System.out.println("Name: " + n));
		  
		

		
	}
		
	}

