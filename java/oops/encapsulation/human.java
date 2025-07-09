package encapsulation;

public class human {
	private String brain;
	private int heart;
	public void setvalues(String B,int H) {
		brain=B;
		heart=H;
	}
	public String getbrain() {
		return brain;
	}
	public int getheart() {
		return heart;
	}
	public void nose() {
		System.out.println("breath");
	}
	public void ear() {
		System.out.println("hear");
	}
	class livingbeing{
		public static void main (String args[]) {
		human life = new human();
		life.setvalues("memory",72);
		life.nose();
		life.ear();
		System.out.println("\n brain used as:"+life.getbrain()+"\n no of beats:"+life.getheart());
	}

}}
