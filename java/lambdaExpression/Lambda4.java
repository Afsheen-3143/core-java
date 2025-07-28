package lambdaExpression;

import java.util.Arrays;
import java.util.List;

//public class Lambda4 {
//
//}
class Product{
	String name;
	double price;
	
	Product(String name,
	double price){
		this.name=name;
		this.price=price;
		
	}
}
public class Lambda4 {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
	            new Product("Phone", 799),
	            new Product("Laptop", 1200),
	            new Product("Tablet", 450)
	        );
		products.sort((p1,p2)->Double.compare(p1.price,p2.price));
		for(Product p:products) {
		System.out.println(p.name+ ":" +p.price);


	}
}}