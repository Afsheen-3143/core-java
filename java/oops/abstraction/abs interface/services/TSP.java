package interfac;

public interface TSP {
	public void calling();
	public void sms();
	public void phno();
	public void recharge();
	default void validity() {
		spamcalls();
		callertunes();
		System.out.println("incomin and outgoing validity");
	}
	static void spamcalls() {
		callertunes();
		System.out.println("incoming spamcalls");
	}
	private static void callertunes() {
		System.out.println("caller tunes validity");
	}

}
