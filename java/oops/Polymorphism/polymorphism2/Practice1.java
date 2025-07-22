package polymorphism2;

//public class Practice1 {
//	
//
//}
//Method Overloading
class addition{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(double a, double b) {
		System.out.println(a+b);
	}
}

public class Practice1 {
	public static void main(String[] args) {
		addition a=new addition();
		a.add(4.56,78.30);
		a.add(43, 13);
		a.add(54, 32, 44);
	}
}