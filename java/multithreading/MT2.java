package multithreading;

public class MT2 {

	public static void main(String[] args) {
		System.out.println("hello, welcome to multi threading");
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());

	}

}
