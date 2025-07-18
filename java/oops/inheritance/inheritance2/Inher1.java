package inheritance2;

 class person {
	String name;
	void display() {
		System.out.println("my name is : "+name);
	}}
	class Student extends person{
		int rollno;
	void showdetails() {
		display();
		System.out.println("roll no : "+rollno);
	}}
	public class Inher1{
		public static void main(String[] args) {
			Student s= new Student();
			s.name="afsheen";
			s.rollno=43;
			s.showdetails();
			
		}
	
	

}
