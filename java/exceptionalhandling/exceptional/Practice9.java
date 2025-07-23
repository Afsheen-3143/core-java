package exceptional;


//chain of throw method
public class Practice9 {
	static void methodA() throws Exception{
		throw new Exception("exception caught");
	}
	static void methodB() throws Exception{
		methodA();
	}
public static void main(String[] args) {
	try {
		methodB();
	}catch(Exception e) {
		System.out.println("handled"+e.getMessage());
	}
}
}
