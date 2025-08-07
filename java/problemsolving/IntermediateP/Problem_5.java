package IntermediateP;

import java.util.Scanner;

//public class Problem5 {
//
//}
class Student{
	int rollno;
	String name;
	int []marks;
	int total=0;
	String[]subjests;
	double average;
	char grade;
	public Student(int rollno, String name, int[] marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public void calculateresult() {
		for (int mark : marks) {
            total += mark;
        }
		 average = total / (double) marks.length;

	        if (average >= 90)
	            grade = 'A';
	        else if (average >= 80)
	            grade = 'B';
	        else if (average >= 70)
	            grade = 'C';
	        else if (average >= 60)
	            grade = 'D';
	        else
	            grade = 'F';
	}
	        public void display(String[]subjects) {
	        	System.out.println("\n----- Report Card -----");
	            System.out.println("Name    : " + name);
	            System.out.println("Roll No : " + rollno);
	            System.out.println("Marks:");
	            for (int i = 0; i < subjects.length; i++) {
	                System.out.println("  " + subjects[i] + ": " + marks[i]);
	            }
	            System.out.println("Total   : " + total);
	            System.out.printf("Average : %.2f\n", average);
	            System.out.println("Grade   : " + grade);
	            System.out.println("------------------------");
	        }
	        
	    
	public class Problem_5 {
		public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);
			    
//			 subject records
			 System.out.println("enter no of subject ");
			 int subjectcount=sc.nextInt();
			 
			 String[]subjects=new String[subjectcount];
			 for(int i=0;i<subjectcount;i++) {
			 System.out.println("enter subject name "+(i+1));
			 sc.nextLine();
			 
			}
		    
//		   student records
		   System.out.println("enter no of students");
		   int studentcount=sc.nextInt();
		   
		   Student[]student=new Student[subjectcount];
		   for(int i=0;i<studentcount;i++) {
			   System.out.println("enter student details"+(i+1));
			   System.out.println("enter name ");
			   String name=sc.nextLine();
			   
			   System.out.println("enter rollno");
			   int rollno=sc.nextInt();
			   
			   int[]marks=new int[subjectcount];
			   for(int j=0;j<subjectcount;j++) {
				   System.out.println("enter marks"+subjects[j]);
				   marks[j]=sc.nextInt();
				   
				   
			   }
			   sc.nextLine();
			   student[i]=new Student(rollno,name,marks);
			   student[i].calculateresult();
			   
			   
		   }
		   System.out.println("all student report cards");
			
		   for(Student s:student) {
			   s.display(subjects);
			   
		   }
		sc.close();
	}
	
}}
