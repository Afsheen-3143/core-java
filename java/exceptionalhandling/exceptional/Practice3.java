package exceptional;

import java.io.FileReader;
import java.io.IOException;

public class Practice3 {
//	static void readfile() throws IOException{
//		FileReader fr =new  FileReader("text.txt");
//		fr.read();
//		fr.close();
//	}
//	public static void main(String[] args) {
//		try {
//			readfile();
//		}
//		catch(IOException e) {
//			System.out.println("file not found");
//		}
//	}
//
//}

	    static void readFile() throws IOException {
	        FileReader fr = new FileReader("test.txt");
	        fr.read();
	        fr.close();
	    }

	    public static void main(String[] args) {
	        try {
	            readFile();
	        } catch (IOException e) {
	            System.out.println("File not found or error reading file.");
	        }
	    }
	}
