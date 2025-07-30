package lambdaExpression;

import java.util.Optional;

class Cat{
	String name;
	int age;
	Cat(String name,
	int age){
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		
		return age;
	}
	
}
public class OPtionalClass1 {
	public static void main(String[] args) {
		Optional<Cat>optionalCat=findCatByName("tom");
		if(optionalCat.isPresent()) {
			System.out.println(optionalCat.get().getAge());
		}else {
				System.out.println(0);
			}
		
	}
	
	
	private static Optional<Cat>findCatByName(String name){
		Cat cat = null;

		if ("pus".equalsIgnoreCase(name)) {
			 cat = new Cat("pus", 8);  // create cat only if name is "pus"
		}
		  // Optionally return based on name
		return Optional.ofNullable(cat);
//        if ("pus".equals(name)) {
//            return Optional.of(cat);
//        } else {
//            return Optional.empty();
//        }
	}

}
