package interfac;

public interface IThub {
	public void associativedeveloper();
	public void backend();
	public void frontend();
	public void UIUX();
	default void data_analyst() {
		security();
		prompting();
		System.out.println("analyse data");
	}
	static void prompting()
{
		security();
		System.out.println("prompting engineer");
	}
	private static void security() {
		System.out.print("company is secure");
	}
	
	
}
