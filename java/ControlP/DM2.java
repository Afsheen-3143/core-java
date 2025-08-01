package ControlP;

public class DM2 {
	public static void main(String[] args) {
		String vehicleType="bike";
		int hour=4;
		int rent = 0;
		switch(vehicleType) {
		case "bike":
			rent=450;
			break;
		case "car":
			rent=780;
			break;
		case "bus":
			rent=1090;
			break;
			default:
				System.out.println("invalid vehicle type");
				return;
		}
		int total=rent*hour;
		System.out.println("total :"+total);
	}

}
