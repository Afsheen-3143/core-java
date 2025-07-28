package lambdaExpression;

import java.util.function.Consumer;

//public class Lambda8 {
//
//}
//custom functional interface using discount calculation
//interface Discount{
//double apply(int amount);
//}
public class Lambda8 {
	public static void main(String[] args) {
//		Discount summer=amt->amt*56;
//		System.out.println(summer.apply(456));
		
		Consumer<String>log=s->System.out.println("log"+s);
		Consumer<String>alert=s->System.out.println("alert"+s);
		
		log.andThen(alert).accept("hello");;


	}
}

