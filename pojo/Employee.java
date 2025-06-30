package pojo;

public class Employee {
	public  int id;
	double salary;
	protected String name;
	public void Employee(int ID,double S,String N) {
		id=ID;
		salary=S;
		name=N;
		
	}
public void setID(int id) {
	this.id=id;
}
public int getID() {
	return id;
}
}
