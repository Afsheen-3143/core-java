package inheritance2;

class Employee{
	private int salary;
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public int getsalary() {
	return salary;
	}}
class manager extends Employee{
	void display() {
		System.out.println("salary"+getsalary());
	}
	
}

public class Inher4{
	public static void main(String[] args) {
		manager m=new manager();
		m.setsalary(50000);
		m.display();
	}
}