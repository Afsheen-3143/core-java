package lambdaExpression;

//public class Lambda2 {
//
//}
@FunctionalInterface
interface Caluculator{
	int operate(int a, int b);//abstract method
}

public class Lambda2 {
	public static void main(String[] args) {
		Caluculator addition=(a,b)->a+b;
		Caluculator subtraction=(a,b)->a-b;
		Caluculator division=(a,b)->a/b;
		Caluculator multiplication=(a,b)->a*b;
		
//		use the implementation
		System.out.println("add "+addition.operate(45, 32));
		System.out.println("subtract "+subtraction.operate(23, 32));
		System.out.println("divide "+division.operate(987, 56));
		System.out.println("multiply"+multiplication.operate(1, 643));



	}
}