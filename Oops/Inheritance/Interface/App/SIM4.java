package interfac;

public class SIM4 implements SIM3 {
	public void calling(){
		System.out.println("calls are permitted");
	}
	public void SMS(){
		System.out.println("SMS is allowed");
	
	}
	public void GPRS() {
		System.out.println("GPRS is avaliable");
	}
	public void camera() {
		System.out.println("camera view is perfect");
	}
 public static void main(String args[]) {
	 SIM4 phone=new SIM4();
	 phone.calling();
	 phone.SMS();
	 phone.camera();
 }
}
