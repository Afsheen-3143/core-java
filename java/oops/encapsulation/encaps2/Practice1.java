package encaps2;

class emp {
	private String name;
	private int salary;
	public void set(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void set(int salary) {
//		validation condition
		if(salary>=50000) {
			this.salary=salary;
			
		}else {
			System.out.println("invalid salary");
		}
		
	}
	public int getsalary() {
		return salary;
		
	}

}
public class Practice1{
	public static void main(String[] args) {
		emp e=new emp();
		e.set(30000);
		e.set("teja");
		System.out.println(e.getname());
		System.out.println(e.getsalary());
	}
}