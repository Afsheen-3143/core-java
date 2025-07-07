package innerclass;

// calling inner class methods in outer class
//public class Class1 {
//	public static void main(String[] args) {
//		System.out.println("outercalss");
//		Class1 outer=new Class1();
//		Class1.classa a=outer.new classa();
//		a.id();
//	}
//	class classa{
//		public void id() {
//			System.out.println("inner class");
//			
//		}
//		
//		
//	}
//
//}
// calling outer calss methods in inner class


public class Class1 {
    public static void main(String[] args) {
        System.out.println("outer class");
        Class1 outer = new Class1();
        outer.outerMethod(); // call outer class method that calls inner class method
    }

    // A method inside the outer class
    void outerMethod() {
        classa a = new classa(); // create inner class instance directly
        a.id();                  // call inner class method from outer class method
    }

    class classa {
        public void id() {
            System.out.println("inner class");
        }
    }
}

