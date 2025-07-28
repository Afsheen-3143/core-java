package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//public class Lambda3 {
//
//}
class Employee{
	String name;
	int salary;
	
	Employee(String name,
	int salary){
		this.name=name;
		this.salary=salary;
		
	}
}
public class Lambda3 {
	public static void main(String[] args) {
		  List<Employee> employees = Arrays.asList( new Employee("Alice", 60000),
	            new Employee("Bob", 45000),
	            new Employee("Charlie", 70000)
	        );
		  Predicate<Employee> highEarner = e -> e.salary > 50000;

	        employees.stream()
	                 .filter(highEarner)
	                 .forEach(e -> System.out.println(e.name + " earns " + e.salary));
	
	}
}