package encapsulation;

public class mobiles {
	private String OS;
	private String signal;
	private int memory;
	public void setvalues(String os, String nw, int storage ) {
		OS=os;
		signal= nw;
		memory=storage;
	}
   public String getOS() {
	   return OS;
   }
   public String getsignal() {
	   return signal;
   }
   public int getmemory() {
	   return memory;
   }
   public void text() {
	   System.out.println("hello world");
   }
   public class phones{
	   public static void main( String args[]) {
		   mobiles mb=new mobiles();
		   mb.text();
		   mb.setvalues("andriod", "five g", 64);
		   System.out.println("\n operating system:"+mb.getOS()+"\n signal processing:"+mb.getsignal()+"\n memory storage:"+mb.getmemory());
	   }
   }
}
