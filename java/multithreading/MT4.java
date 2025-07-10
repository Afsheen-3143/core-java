package multithreading;

public class MT4 {
	public static void main(String[] args) throws InterruptedException {
		BrickDiary b=new BrickDiary();
		Runnable r1=()->{
			for(int i=0;i<10000;i+=50) {
			b.increament();
			}
		};
		Runnable r2=()->{
			for(int i=0;i<10000;i+=50) {
				b.increament();
			}
		};
		Runnable r3=()->{
			for(int i=0;i<10000;i+=50) {
				b.increament();
			}
		};
		Thread  t1=new Thread(r1);
		Thread  t2=new Thread(r2);
		Thread  t3=new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println(Thread.activeCount());
		System.out.println(b.brickcount);
		System.out.println(b.brickcount2);
	}
	

}
class BrickDiary{
	volatile int brickcount=0;
	volatile int brickcount2=0;
	public  void increament() {
		brickcount+=50;
		brickcount2+=50;
	}
	
}
