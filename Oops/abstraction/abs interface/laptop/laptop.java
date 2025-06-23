package interfac;

public interface laptop {
	public void copy();
	public void cut();
	public void paste();
	public void save();

default void security()
{
	camera();
	commoncode();
	System.out.println("security code");
}
static void camera() {
	commoncode();
	System.out.println("capture code");
}
private static void commoncode() {
	System.out.println("common code");
}
private void display() {
	System.out.println("display code");
}
}
