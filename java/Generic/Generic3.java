package String;
//Bounded type
public class Generic3 <T extends Number>{
//	constructor
	T value;
	Generic3(T value){
		this.value=value;
	}
	
//square method
	public double square() {
		return value.doubleValue()*value.doubleValue();
	}
	
}
 class square1{
	 public static void main(String[] args) {
		Generic3<Integer>s=new Generic3<>(8);
		System.out.println(s.square());
	}
 }