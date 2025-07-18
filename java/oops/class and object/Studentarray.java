package ObjectClass;

import java.util.Scanner;

class Student{
	
	String name;
	int marks;
	
Student(String name,int marks){
    this.name=name;
	this.marks=marks;
	
}

}
public class Studentarray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[]students=new Student[5];
		for(int i=0;i<students.length;i++) {
			System.out.println("enter the name of the student"+(i+1));
			String name=sc.nextLine();
			System.out.println("enter marks"+(i+1));
			int marks=sc.nextInt();
			sc.nextLine();
			students[i]=new Student(name,marks);
		}
		System.out.println("students score more than 80");
		for(Student s:students) {
			if(s.marks>80) {
				 System.out.println(s.name + " scored " + s.marks);
				
			}
		
		  
	}
		sc.close();
}}