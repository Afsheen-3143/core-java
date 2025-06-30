package pojo;

public class Program {
	public static void main(String[] args) {
		
	Employee emp=new Employee();
	emp.setID(23);
	emp.salary=5555.5;
	emp.name="affu";
	Employee emp1=new Employee();
	emp1.setID(23);
	emp1.salary=5555.5;
	emp1.name="affu";
	Employee emp3=new Employee();
	emp3.setID(23);
	emp3.salary=5555.5;
	emp3.name="affu";
	Employee []employees=new Employee[]{emp,emp1,emp3};
	
System.out.println(emp.getID());
System.out.println(emp.salary);
System.out.println(emp.name);
System.out.println(emp1.getID());
System.out.println(emp1.salary);
System.out.println(emp1.name);
System.out.println(emp3.getID());
System.out.println(emp3.salary);
System.out.println(emp3.name);
}}


