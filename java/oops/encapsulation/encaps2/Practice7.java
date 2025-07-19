package encaps2;

class books {
	private String title;
	private boolean Isissued=true;
	
//	public void Issuebook() {
//		Isissued=true;
//		
//	}
//	public void returnbook() {
//		Isissued=false;
//	}
//	public boolean Isissued() {
//		return Isissued;
//	}
	public  void set(String title) {
		this.title=title;
	}
	
	public String gettitle() {
		return title;
		
	}

}
public class Practice7{
	public static void main(String[] args) {
		
	
	books b=new books();
//	b.Issuebook();
//	b.returnbook();
	b.set("cs");
	System.out.println(b.gettitle());
}}