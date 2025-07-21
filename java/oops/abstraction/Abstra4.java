package abstraction;

//public class Abstra4 {
	abstract class Bird{
		protected String species;
		public Bird(String species) {
			this.species=species;
		}
		public abstract void makesound();
		public void eat() {
			System.out.println(species+"eats grains");
		}}
		class Eagle extends Bird {
           public Eagle(String species) {
				super(species);
				
			}

//			public Eagle() {
//				super(species);
//			}

			@Override
			public void makesound() {
				System.out.println("Eagle makes sound");
				
			}
			
			
		}

public class Abstra4{
	public static void main(String[] args) {
		Eagle e=new Eagle("bird");
		e.eat();
		e.makesound();
		
	}
}
