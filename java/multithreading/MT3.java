package multithreading;

public class MT3 {
	public static void main(String[] args) {
		Runnable r1=()-> {
			for(int i=0;i<=20;i++) {
				System.out.println("runnable interface");
			}};
		Thread t1=new Thread(r1);
	t1.start();
//		anonymous class
//		Runnable r1=new Runnable() {
//			public void run() {
//				System.out.println("runnable interface");
//		}};
//		Thread t1=new Thread(r1);
//	t1.start();
//		student e1=new student();
//		Thread t1=new Thread(e1);
//		t1.start();
//		 System.out.println(Thread.activeCount());
	}

}
//implementing runnable interface
// class student implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("runnable interface");
//		
//	}
//	
//}