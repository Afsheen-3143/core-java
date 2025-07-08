package innerclass;

	public class Class4 {
	    private String message = "Outer says hi!";

	    class Inner {
	        void display() {
	            System.out.println("Inner reads: " + message);
	        }
	    }
	}

	 class MemberInnerExample {
	    public static void main(String[] args) {
	        Class4 outer = new Class4();              // create outer instance
	        Class4.Inner inner = outer.new Inner();  // create inner instance
	        inner.display();                        // call inner method
	    }
	}
