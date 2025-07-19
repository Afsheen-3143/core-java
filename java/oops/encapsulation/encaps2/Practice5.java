package encaps2;

	 class Employee {
	    private String name;
	    private double salary;

	    public void setSalary(double salary) {
	        if(salary >= 15000) {
	            this.salary = salary;
	        } else {
	            System.out.println("Salary too low!");
	        }
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void showInfo() {
	        System.out.println("Employee: " + name + ", Salary: ₹" + salary);
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	}



public class Practice5 {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("ramu");
		e.setSalary(23000);
		e.showInfo();
		System.out.println(e.getSalary());
		
	}
}
