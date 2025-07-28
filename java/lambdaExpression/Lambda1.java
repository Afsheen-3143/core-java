package lambdaExpression;

public class Lambda1 {
	public static void main(String[] args) {
//		with lambda exp
		new Thread(()->System.out.println("thread starts")).start();
		
		
//		Runnable r=new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("thread starts");
//				
//			}
//			
//			
//		};
//		Thread t=new Thread(r);
//		t.start();
	}

}
