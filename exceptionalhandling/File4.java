package unchecked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File4 {
public static void main(String[] args) throws Exception {
	File file=new File("./demo1.txt");
	String longestline="";
	int maxlength = 0;
Scanner scanner = new Scanner(file);

while(scanner.hasNextLine()) {
	
	String Currentline=scanner.nextLine();
	if(Currentline.length()>maxlength) {
		maxlength=Currentline.length();
		longestline=Currentline;
	}
	
}
scanner.close();
System.out.println("print longestline");
System.out.println(longestline);
System.out.println("length of the longestline"+maxlength+"characters");
}
}
