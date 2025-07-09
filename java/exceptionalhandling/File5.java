package unchecked;


	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;

	public class File5 {
	    public static void main(String[] args) throws IOException {
	        // Replace with your file path or keep it relative to your project
	        File file = new File("./demo1.txt");

	        int wordCount = 0;

	        Scanner reader = new Scanner(file);

	        while (reader.hasNextLine()) {
	            String line = reader.nextLine();

	            // Split line into words using one or more spaces, tabs, etc.
	            String[] words = line.trim().split("\\s+");

	            // Avoid counting empty lines
	            if (!line.trim().isEmpty()) {
	                wordCount += words.length;
	            }
	        }
	        reader.close();

	        System.out.println("✅ Total number of words in the file: " + wordCount);
	    }
	}



