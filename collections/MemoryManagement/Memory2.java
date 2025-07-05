package propertieshandling;

public class Memory2 {
	public static void main(String[] args) {
		new Memory2().add(1);
	}
public void add(int i) {
	System.out.println(i);
	i++;
	add(i);
}
}
