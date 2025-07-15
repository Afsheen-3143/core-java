package String;

class grandparent{
	String name="affu";
	
}
class parentclass{
	String name="Afsheen";
	int age=21;
	public void printdetails() {
		System.out.println("print the name"+name);
		System.out.println("print the age"+age);
		
	}
}


public class SuperKey extends parentclass{
	String name="mohammed";
public static void main(String[] args) {
	SuperKey sk=new SuperKey();
	sk.dummy();
	sk.printdetails();
}
public void dummy() {
	super.printdetails();
}
@Override
public void printdetails() {
//	System.out.println("print the name"+name);
//	System.out.println("print the age"+age);
//	for code reusability
	super.printdetails();
	
	System.out.println("Iam a trainer");
}
}
