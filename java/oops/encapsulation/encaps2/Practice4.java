package encaps2;
class user
 {
//	Write-only Encapsulation – Hide Sensitive Info
	
	    private String password;

	    // Only setter
	    public void setPassword(String password) {
	        this.password = password;
	    }

	    // No getter to prevent exposure
	}


 public class Practice4{
	public static void main(String[] args) {
		user p=new user();
		p.getClass();
		p.setPassword(null);
		System.out.println(p);
	}
}
