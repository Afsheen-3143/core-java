package problems;

public class Problem11 {
//	public static void main(String[] args) {
		int weight=111;
		double height=1.5;
		
		
	public void BMI(){
		double BMI = weight/(height*height);
		System.out.println("BMI of the person"+BMI);
	
	if(BMI<18.5) {
		System.out.println("underweight");
	}else if(BMI>=18.5&&BMI<24.9) {
		System.out.println("Normal");
	}else if(BMI>=25&&BMI<29.5) {
		System.out.println("overweight");
	}else {
		System.out.println("obsese");
	}}
	public static void main(String[] args) {
		Problem11 p=new Problem11();
		p.BMI();
	}

}
