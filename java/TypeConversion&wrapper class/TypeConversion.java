package String;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=10;
		int i=500;
		double d=55.2;
		char c='a';
		short s=200;
		boolean bo=true;
		long l=9000;
		i=b;
		b=(byte)i;
		long b2=b+i+l;
		System.out.println(b2);
	}

}
