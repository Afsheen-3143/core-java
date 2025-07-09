package problemsolving;

public class PTR {
private double principal;
private double rate;
private double time;
PTR(double p,double t,double r){
	principal=p;
	rate=r;
	time=t;
}
double calculateintrest() {
	return(principal*time*rate)/100;
}
public static void main(String args[]) {
	PTR P=new PTR(1000,5,2);
	double simpleinterest=P.calculateintrest();
	System.out.println("calculate PTR"+simpleinterest);
}
}
