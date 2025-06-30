package unchecked;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class File6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file1= new File("./demo.txt");
		File file2=new File("./demo1.txt");
		File merged=new File("./merged.txt");
		 FileWriter writer = new FileWriter(merged);
		Scanner scanner1=new Scanner(file1);
		while(scanner1.hasNextLine()) {
			String line=scanner1.nextLine();
			writer.write(line + "\n");
		}
		scanner1.close();
		
	Scanner scanner2=new Scanner(file2);
	while(scanner2.hasNextLine()) {
		String line=scanner2.nextLine();
		writer.write(line + "\n");
	}
	scanner2.close();
	writer.close();
	 System.out.println("Successfully merged files into: " + merged.getAbsolutePath());

}
}