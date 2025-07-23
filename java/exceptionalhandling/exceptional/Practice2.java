package exceptional;

public class Practice2 {
	 static void checkage(int age) {
		 if(age<18) {
			 throw new ArithmeticException("cannot vote");
		 }else {
			 System.out.println(" 18+ can vote");
		 }
		
	}
	 public static void main(String[] args) {
		checkage(14);
	}

}
