package encapsulation;

public class affu {
private int id;
private String name;
private int salary;
public void setvalues (int ID, int S, String N) {
	id = ID;
	salary = S;
	name = N;
	
}
public int getid() {
	return id;
}
public int getsalary() {
	return salary;
}
public String getname() {
	return name;
}
 class details{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
affu e=new affu();
e.setvalues(001,20,"teja");
System.out.println("\n employe id"+e.getid()+"\n salary"+e.getsalary()+"\nemploye name:"+e.getname());




	}

}
}
