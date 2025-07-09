package multithreading;
class MT1 extends Thread {
//    public void run() {
//        System.out.println("Thread is running...");
//    }
//    
    public static void main(String[] args) {
//    	 Thread t1 = new Thread();
//         Thread t2 = new Thread();
//         Thread t3 = new Thread();
//         Thread t4 = new Thread();
//         Thread t5 = new Thread();
//
//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//         t5.start();
	employee t1=new employee("t1");
			t1.start();
        
        System.out.println(Thread.activeCount());
    }
}
class employee extends Thread{
	public employee(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("run the thread"+Thread.currentThread().getId()+">>>"+Thread.currentThread().getName());
	}
}