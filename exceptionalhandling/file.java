package unchecked;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class file{
	    public static void main(String[] args) {
	        try {
	            // Try to read from a file that doesn't exist
	            File file = new File("myfile.txt");
	            Scanner reader = new Scanner(file);

	            // Read and print file contents
	            while (reader.hasNextLine()) {
	                String data = reader.nextLine();
	                System.out.println(data);
	            }

	            reader.close();
	        } catch (FileNotFoundException e) {
	            // Handle the exception if file not found
	            System.out.println("File not found: " + e.getMessage());
	        }
	    }
	}



