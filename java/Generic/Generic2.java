package String;
//Generic with classes;
public class Generic2<T> {
private T item;
public void setItem(T item) {
	this.item=item;
}
public T getItem() {
	return item;
	
}
}
class main{
	public static void main(String[] args) {
		Generic2<String>StringBox=new Generic2<>();
		StringBox.setItem("hi");
		System.out.println(StringBox.getItem());
		Generic2<Integer>intBox=new Generic2<>();
		intBox.setItem(111);
		System.out.println(intBox.getItem());
	}
}