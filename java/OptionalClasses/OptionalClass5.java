package lambdaExpression;

import java.util.Optional;

class Address{
	String city;
	public Address(String city) {
		this.city=city;
	}
	     Optional<String> getCity() {
	        return Optional.ofNullable(city);

		}
	}
class Person{
	Address address;
	public Person(Address address) {
		this.address=address;
	}
	Optional<Address> getaddress() {
        return Optional.ofNullable(address);

	
}
}
public class OptionalClass5 {
	public static void main(String[] args) {
		Address address=new Address("mumbai");
		Person person =new Person(address);
		String city=Optional.of(person)
				 .flatMap(Person::getaddress)
				 .flatMap(Address::getCity)
				 .orElse("default");
		 System.out.println("City"+city);
				 
	}
}


