package propertieshandling;

public class MemoryManagement {
	int orgID=9032;
	static double orgIncome=1000000;
	String orgName="Google";
	String CEO="Sundar pichai";

	public static void main(String[] args) throws InterruptedException {
		int empID=1;
		int empno=01234567;
		String empName="Teja";
	    double salary=20000;
	    
	    MemoryManagement m=new  MemoryManagement();
	    m.getOrgId();
	    System.out.println(m.getOrgId());
	    MemoryManagement m1=new  MemoryManagement();
	    m.deleteEmployee(1);
	    Thread.sleep(100000);
	}
	public int getOrgId() {
		return orgID;
		
	}
	public static double Networth() {
		return Networth();
		
	}
	public void deleteEmployee(int empID) {
		
		
	}

}
