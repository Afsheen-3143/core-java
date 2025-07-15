package String;

public class Generic1 {
	public static void main(String[] args) {
		
	
	swap("hello","world");
	swap(6,7);
	swap(true,false);
	swap(9.89,8.76);
	}
	public static<T>void swap(T i,T j){
		T temp ;
		temp=i;
		i=j;
		j=temp;
		System.out.println("after swapping "+i+">>>>>"+j);
		
	}

}
