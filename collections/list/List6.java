package lists;
import java.util.*;

public class List6 {
public static void main(String[] args) {
	List<Integer>primes=new ArrayList<>();
	int limit=50;
	for(int i=2;i<limit;i++) {
		boolean isprime=true;
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0) {
				isprime=false;
				break;
			}
		}
		if(isprime) {
			primes.add(i);
		}
	}
	System.out.println("prime number up to:"+limit+ " "+primes);
}
}
