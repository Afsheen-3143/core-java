package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee1{
    String name;
    double salary;

    Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Lambda7 {
	public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
            new Employee1("Afsheen", 70000),
            new Employee1("Teja", 40000),
            new Employee1("Renuka", 55000)
	);
        
//        lambda expression
        Predicate<Employee1> highEarner =e->e.salary>50000;
        for (Employee1 employee1 : employees) {
		if(highEarner.test(employee1))	{
		
        System.out.println(employee1.name+":"+employee1.salary);
//        Predicate<Employee1> highEarner = new Predicate<Employee1>() {
//
//			@Override
//			public boolean test(Employee1 t) {
//				// TODO Auto-generated method stub
//				return t.salary>50000;
//			}
//			
//        };
//        for (Employee1 employee : employees) {
//        	 if (highEarner.test(employee)) {
//        	System.out.println(employee.name+":"+employee.salary);
			
		}
        
	}}}