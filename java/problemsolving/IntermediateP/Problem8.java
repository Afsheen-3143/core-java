package IntermediateP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//public class Problem8 {
//
//}
class Product{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(String name, int quantity, int price ) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	private String name;
	private int price;
	private int quantity;
	
	public String toString() {
		 return name + " | Qty: " + quantity + " | Price: ₹" + price;
		
	}
}

public class Problem8{
	static List<Product>Inventory=new ArrayList<>();
	static final int LOW_STOCK_THRESHOLD = 5;
	 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		 
		 while(true) {
			 System.out.println("----product inventory system----");
			 System.out.println("1. add product");
			 System.out.println("2. purchase product");
			 System.out.println("3. view inventory");
			 System.out.println("4. serach product by name");
			 System.out.println("5. low stock alert");
			 System.out.println("6. sort product by price");
			 System.out.println("7. exit");
			 System.out.println("enter your choice");
			 int choice=sc.nextInt();
			 
			 switch(choice) {
			 
			 case 1:
				 addproduct();
				 break;
				 
			 case 2:
				 purchaseproduct();
				 break;
				 
			 case 3:
				 viewinventory();
				 break;
				 
			 case 4:
				 searchproduct();
				 break;
				 
			 case 5:
				 lowstock();
				 break;
				 
			 case 6:
				 sortproduct();
				 break;
				 
			 case 7:
				 exit();
				 System.out.println("thank you for shopping!!!");
				 break;
			 }}
		 }
		 
	

	private static void addproduct() {
		System.out.println("enter product name");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("enter quantity");
		int qty=sc.nextInt();
		System.out.println("enter price");
		int price=sc.nextInt();
		 Inventory.add(new Product(name, qty, price));
	        System.out.println("Product added.");

		
	}

	private static void purchaseproduct() {
		viewinventory();
		System.out.println("enter name of the product");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("enter quantity of the product");
		int qty=sc.nextInt();
		
		for(Product p:Inventory) {
			 if (p.getName().equalsIgnoreCase(name)) {
			if(p.getQuantity()<qty) {
				p.setQuantity(p.getQuantity()-qty);
				System.out.println("purchased successfully");
			}else {
				System.out.println("can not purchase");
			
		}return;
			 }
		}
		System.out.println("out of stock");
	}

	private static void viewinventory() {
		if(Inventory.isEmpty()) {
			System.out.println("inventory is empty");
		}else {
				System.out.println("product in list");
			for (Product p : Inventory) {
				System.out.println(p);
			}
			}
		
		
	}

	private static void searchproduct() {
		System.out.println("enter product name");
		String name=sc.nextLine();
		sc.nextLine();
		  List<Product> results =  Inventory.stream()
		  .filter(p -> p.getName().equalsIgnoreCase(name))
          .collect(Collectors.toList());
		  
		  if(results.isEmpty()) {
			  System.out.println("no product available");
		  }else {
			  System.out.println("product available");
			  results.forEach(System.out::println);
		  }


		
		
	}

	private static void lowstock() {
		System.out.println(" low stock product"+LOW_STOCK_THRESHOLD);
		
		Inventory.stream()
		.filter(p->p.getQuantity()<LOW_STOCK_THRESHOLD)
		.forEach(System.out::println);
	}

	private static void sortproduct() {
		Inventory.stream()
		 .sorted(Comparator.comparingInt(Product::getPrice))
         .forEach(System.out::println);

		
	}

	private static void exit() {
		// TODO Auto-generated method stub
		
	}
}