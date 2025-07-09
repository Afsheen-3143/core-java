package propertieshandling;

public class AnonymousObjects {
	String name="Afsheen";
	public void greet() {
		System.out.println("greet"+name);
	}
		public static void main(String[]args) {
			new AnonymousObjects().greet();
		
	}

}
