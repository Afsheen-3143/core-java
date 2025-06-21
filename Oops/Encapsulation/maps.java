package encapsulation;

public class maps {
	private String GPS;
	private String CPU;
public void setvalues(String gps,String cpu) {
	GPS=gps;
	CPU=cpu;
}
public String getGPS() {
	return GPS;
}
public String getCPU() {
	return CPU;
}
public  void location() {
	System.out.println("enter the location:");
}
class googlemaps{
	public static void main (String args[]) {
		maps M=new maps();
		M.location();
		M.setvalues("locates path", "calculates route");
		System.out.println("\n enter GPS"+M.getGPS()+"\n enter CPU"+M.getCPU());
		
	}
}

}
