package unchecked;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File3 {
	public static void main(String args[]) throws IOException {
		File file=new File("./demo1.txt");
		
				int count = 0;
		Scanner scanner = new Scanner(file);


		while(scanner.hasNextLine()) {
			scanner.nextLine();
			count++;
		}
		scanner.close();
		System.out.println(" Number of lines in the file: " + count);
	}

}

//    public static void main(String[] args) throws IOException {
//        // Replace with your file path or keep it relative to your project
//        File file = new File("./demo1.txt");
//
//        // Line counter
//        int lineCount = 0;
//
//        // Read the file line by line
//        Scanner reader = new Scanner(file);
//        while (reader.hasNextLine()) {
//            reader.nextLine(); // Read line, but we don’t need the content
//            lineCount++;
//        }
//        reader.close();
//
//        System.out.println("Number of lines in the file: " + lineCount);
//    }
//}
