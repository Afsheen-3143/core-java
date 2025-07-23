package exceptional;

//custom exception
class InvalidAgeException extends Exception{
	InvalidAgeException(String messege){
		super(messege);
	}}
	public class Practice6{
		static void checkage(int age) throws InvalidAgeException{
		if(age<18) 
			throw new InvalidAgeException ("cannot vote");
		else 
			System.out.println(" eligible to vote");
		
			
		}
		public static void main(String[] args) {
			try{
				checkage(15);
			}
			catch(InvalidAgeException e) {
				System.out.println("Exception occured"+e.getMessage());
			}
		}
		
	}
	



