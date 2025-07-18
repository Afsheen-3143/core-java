package ObjectClass;
//constructor overloading
class Rectangle {
int length;
int width;
 Rectangle(int length,int width){
	this.length=length;
	this.width=width;
}
 Rectangle(int length){
	this.length=length;
	this.width=length;
}
 int area() {
	 return  length*width;
 }
 void display(){
	 System.out.println(length+"length"+width+"width"+area()+"area");
 }

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(10,5);
		rectangle.display();
		Rectangle square=new Rectangle(6);
		square.display();
	}
}

