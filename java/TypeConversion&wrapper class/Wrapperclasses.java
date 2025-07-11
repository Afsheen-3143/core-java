package String;

public class Wrapperclasses {
	public static void main(String[] args) {
		int i=90;
		Integer i1=new Integer(i);
		System.out.println(i1);
		Integer i2=Integer.valueOf(88);
		System.out.println(i2);//Boxing method
		Integer i3=i2;//Auto Boxing
		System.out.println(i3);
		int i4=Integer.valueOf(i3);// Unboxing
		System.out.println(i4);
		int i5=i1;
		System.out.println(i5);//auto Unboxing
//		object conversion
		String s="14";
		int age = Integer.valueOf(s);
		System.out.println(age);
//		parse method 
		int age1=Integer.parseInt(s);
		System.out.println(age1);
		
	}

}
