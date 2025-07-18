package inheritance2;

 class Animal {
	 void eat() {
		 System.out.println("animals eats food");
	 }}
	 class Mammals extends Animal{
		 void walk() {
			 System.out.println("mammals walk on ground");
		 }}
		 class dog extends Mammals{
			 void bark() {
				 System.out.println("dog barks");
			 }
		 
	 }
	
public class Inher2{
	public static void main(String[] args) {
		dog d=new dog();
		d.bark();
		d.eat();
		d.walk();
	}
}

