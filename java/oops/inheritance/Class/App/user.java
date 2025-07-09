package inheritance;

public class user {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guest Guest = new guest();
		developer Develop = new developer();
		admin Admin = new admin();
		Guest.read();
		Develop.read();
		Develop.write();
		Admin.read();
		Admin.write();
		Admin.manage();

	}

}
