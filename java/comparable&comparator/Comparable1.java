package String;

	

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	public class Comparable1 {
	    public static void main(String[] args) {
	        Student[] students = {
	            new Student(1, "affu", 200),
	            new Student(56, "akshitha", 200),
	            new Student(13, "deva", 200),
	            new Student(3, "renuka", 200)
	        };

	        List<Student> list = new ArrayList<>(Arrays.asList(students));
	        Collections.sort(list); // ✅ This works now
	        System.out.println(list);
	    }
	}

	class Student implements Comparable<Student> {
	    int rollno;
	    String name;
	    int marks;

	    public Student(int rollno, String name, int marks) {
	        this.rollno = rollno;
	        this.name = name;
	        this.marks = marks;
	    }

		@Override
		public String toString() {
			return rollno+" "+name+" "+marks;
		}
		@Override
		public int compareTo(Student anotherStudent ) {
			// TODO Auto-generated method stub
//			int x=this.rollno;
//			int y=anotherStudent.rollno;
//			return (x<y)?-1:((x==y)?0:1);
//			return Integer.compare(this.rollno, anotherStudent.rollno);
//			return this.name.compareTo(anotherStudent.name);//returning names in order
			return anotherStudent.name.compareTo(this.name);//returning reverse order names
	    }
	}



