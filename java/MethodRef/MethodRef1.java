package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

//staticmethod  with class
public class MethodRef1 {
//	public static void display(String msg) {
//		System.out.println("msg:"+msg);
//	}
//	public static void main(String[] args) {
		
//		Consumer<String>c=MethodRef1::display;
//		c.accept("hi,hello");
	
		
//		Instance method with specifiv object
//	public  void display(String msg) {
//		System.out.println("msg:"+msg);
//	}
//	public static void main(String[] args) {
//		MethodRef1 obj=new MethodRef1();
//		Consumer<String>f=obj::display;
//		f.accept("welcome");
		
//		instance method reference of specific type
	
	public  void display(String msg) {
		System.out.println("msg:"+msg);
	}
	public static void main(String[] args) {
		 List<String>l=Arrays.asList("affu","teja","vas");
		l.sort(String::compareToIgnoreCase);
		System.out.println(l);
	}
	}


