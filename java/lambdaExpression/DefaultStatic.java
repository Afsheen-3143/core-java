package lambdaExpression;

//public class DefaultStatic {
//
//}
interface printer{
	default void print() {
		System.out.println("printing");
	}
	static void printingInfo(){
		System.out.println("printing info");
	}
}
class TextPrinter implements printer {}
public class DefaultStatic implements printer {
	public static void main(String[] args) {
		TextPrinter tp=new TextPrinter();
		tp.print();
		printer.printingInfo();
	}
}