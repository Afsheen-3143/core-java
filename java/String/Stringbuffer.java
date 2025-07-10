package String;

public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("Dmantz");
		StringBuffer sb2=new StringBuffer("Dmantz");
		System.out.println(sb1==sb2);
		sb1.append("Technologies");
		System.out.println(sb1);
		System.out.println(sb1==sb1);
		System.out.println(sb2.append("s"));
		System.out.println(sb1.delete(0, 6));
		System.out.println(sb1.capacity());
	}

}
//same methods and operations are used in StringBuilder
//difference between these two are synchronization is present in StringBuffer and absent in StringBuilder