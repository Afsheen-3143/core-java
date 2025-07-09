package innerclass;

public class UserFunctionalInter {

	public static void main(String[] args) {
		FunctionalInter F=new FunctionalInter() {

			@Override
			public void drive() {
				System.out.println("drive the car");
				
			}
			
		};
		F.drive();

	}

}
