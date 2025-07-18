package ObjectClass;

public class StaticNonstatic {
//int id;
//static int count;
//StaticNonstatic(){
//	count++;
//	id=count;
//}
//void display()
//{
//System.out.println("no of count"+count);
//System.out.println("id of the"+id);
//}
//public static void main(String[] args) {
//	StaticNonstatic s1=new StaticNonstatic();
//	s1.display();
//	StaticNonstatic s2=new StaticNonstatic();
//	s2.display();
//	StaticNonstatic s3=new StaticNonstatic();
//    s3.display();
// anonymous object
	void Greeting() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		new StaticNonstatic().Greeting();
	}
}

