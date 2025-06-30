package unchecked;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class File7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file=new File("./demo1.txt");
		try{
			FileReader fr=new FileReader(file);
		FileInputStream fir=new FileInputStream (file);
		InputStreamReader isr= new InputStreamReader(fir);
		BufferedReader br=new BufferedReader(isr);
		String line=new String();
		String text=new String();
		while((line=br.readLine())!=null) {
			text+= line+"\n";
		}
		System.out.println(text);
int[]arr= {1,2};
System.out.println(arr[2]);}
catch(ArrayIndexOutOfBoundsException|ArithmeticException e2) {
	e2.printStackTrace();
}
	System.err.println("common output");
}
	}


