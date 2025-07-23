package exceptional;

//multiple catch blocks
public class Practice7 {
	public static void main(String[] args) {
//		try{
//			int[]arr=new int[5];
//		
//		System.out.println(0/5);
//		System.out.println(arr[2]);
//		}
//	 catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//        System.out.println("Caught exception: " + e);
//		}
//	}
//
//}


//Null pointer
String name=null;
try {
	System.out.println(name.length());
}
catch(NullPointerException e) {
	System.out.println("caught Exception");
}
}}