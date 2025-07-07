package propertieshandling;

public class Garbagecollection {
	public void finalize() {
		System.out.println("finalize the objects");
	}
public static void main(String[] args) {
	Garbagecollection gc1=new Garbagecollection();
	Garbagecollection gc2=new Garbagecollection();
	Garbagecollection gc3=new Garbagecollection();
	new Garbagecollection();
	gc1=null;
	gc2=gc3;
	System.gc();
	
}
}
