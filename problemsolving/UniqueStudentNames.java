package problemsolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueStudentNames {
	
	    public static void main(String[] args) {
	        List<String> students = new ArrayList<>();
	        students.add("Alice");
	        students.add("Bob");
	        students.add("Alice");  // duplicate

	        // Remove duplicates using Set
	        List<String> uniqueStudents = new ArrayList<>(new HashSet<>(students));

	        System.out.println("Unique Students:");
	        for (String name : uniqueStudents) {
	            System.out.println(name);
	        }
	    }
	}



