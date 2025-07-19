package encaps2;

class Student {
	String name;
	int id;
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public String getname() {
		return name;
		
	}
public int getid() {
	return id;
	
	
}
}
public class Practice3{
	public static void main(String[] args) {
		Student s=new Student("affu", 0);
	System.out.println(s.getname());
	System.out.println(s.getid());
	}
}
