package innerclass;


public class Class9 {

	public static void main(String[] args) {
		Interface i=new Interface() {

			@Override
			public void attend() {
				System.out.println("attendane");
				
			}

			@Override
			public void marks() {
				System.out.println("getmarks");
				
			}};
			
			i.attend();
			i.marks();

	}

}

	