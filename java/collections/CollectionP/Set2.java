package Collection;

import java.util.HashSet;
import java.util.Set;


	class Student {
	    int id;
	    String name;
	    Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public String toString() {
	        return id + " " + name;
	    }

	    public boolean equals(Object o) {
	        Student s = (Student) o;
	        return id == s.id;
	    }

	    public int hashCode() {
	        return id;
	    }
	}

	public class Set2 {
	    public static void main(String[] args) {
	        Set<Student> students = new HashSet<>();
	        students.add(new Student(1, "John"));
	        students.add(new Student(1, "John")); // Duplicate based on id

	        System.out.println(students.size()); // Output: 1
	    }
	}



