package String;

public class Enum {

	public static void main(String[] args) throws Exception{
		enum days{
			MONDAY(7,8),TUESDAY(10,7),WEDNESDAY(9.30,10),THURSDAY,FRIDAY,SATURDAY(9,9), SUNDAY(0);
			int index;
			String status;
			double openingTime;
			double closingTime;
			private days() {
				System.out.println("shop is  not open");
			}
			private days(int index) {
				index=this.index;
				
			}
			private days (String status) {
				 status=this. status;
			}
			private days(double openingTime, double closingTime ) {
				this.openingTime=openingTime;
				this.closingTime=closingTime;
			}
			 public double getopeningTime() {
		            return openingTime;
		        }

		        public double getclosingTime() {
		            return closingTime;
		        }
		}
days day=days.FRIDAY;		
	
switch(day) {
case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY->System.out.println(day+"week days+"+day.openingTime+"to"+day.closingTime);
case SATURDAY, SUNDAY->System.out.println("weekend");
}

}}