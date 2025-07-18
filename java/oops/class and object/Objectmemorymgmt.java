package ObjectClass;

public class Objectmemorymgmt {
	String name;
	int id;
	public Objectmemorymgmt(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public void show() {
		System.out.println(""+name+""+id);
	}
	@Override
	protected void finalize() {
		System.out.println("destoried object"+ name+id  );
	}
		
	public static void main(String[] args) {
		Objectmemorymgmt o1=new Objectmemorymgmt("affu", 101);
		Objectmemorymgmt o2=new Objectmemorymgmt("tejaa", 102);
		o1.show();
		o2.show();
		o1=null;
		System.gc();
		o1.show();
		
	}
}
