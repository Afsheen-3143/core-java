package IntermediateP;

public class Problem2 {
	
String name;
int id;
double salary;

Problem2(String name, int id, double salary){
	this.name=name;
	this.id=id;
	this.salary=salary;
}

public double netsalary() {
	double netsalary=salary+(0.20*salary+0.10*salary+0.12*salary);
	return netsalary;
	

}
public double getnetsalary() {
	return netsalary();
}
public static void main(String[] args) {
	Problem2 p2=new Problem2("affu", 43, 30000);
	Problem2 p3=new Problem2("tej", 44, 39000);
	System.out.println("Name: " +p2.name + "Net salary " + p2.getnetsalary());
	System.out.println("Name: " +p3.name + "Net salary " + p3.getnetsalary());
	

}
}
