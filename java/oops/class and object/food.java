package oops;

public class food {
	String type;
	String quantity;
	int price;
	String taste;
	String state;
public food(String t, String q, int p, String ts, String s)
{
	type=t;
	quantity=q;
	price=p;
	taste=ts;
	state=s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
food Dinner = new food("Biryani","one plate",250,"spicy","solid" );
System.out.println("type:"+Dinner.type);
System.out.println("quantity:"+Dinner.quantity);
System.out.println("price:"+Dinner.price);
System.out.println("taste:"+Dinner.taste);
System.out.println("state:"+Dinner.state);
	}

}
