package String;

public class Enum1 {
	

	    // Enum declared outside the main method
	    enum Days {
	        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	    }

	    public static void main(String[] args) {
	        Days day = Days.FRIDAY;

	        if (day == Days.MONDAY || day == Days.TUESDAY || day == Days.WEDNESDAY ||
	            day == Days.THURSDAY || day == Days.FRIDAY) {
	            System.out.println("Weekday");
	        } else if (day == Days.SATURDAY || day == Days.SUNDAY) {
	            System.out.println("Weekend");
	        }
	    }
	}



