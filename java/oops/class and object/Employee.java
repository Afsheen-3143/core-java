package ObjectClass;

import java.util.Scanner;

public class Employee {
	String name;
	double salary;
	Employee(){
		this.name=name;
		this.salary=salary;
		
	}

	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("name"+name+"salary"+salary);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println("default constructor");
		emp.display();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the name");
		String empname=sc.nextLine();
		System.out.println("enter the salary");
		int empsalry=sc.nextInt();
		Employee emp1=new Employee(empname,empsalry);
		emp.display();
	}
}
