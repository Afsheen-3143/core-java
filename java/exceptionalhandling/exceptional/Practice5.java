package exceptional;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice5 {

	  public static void readFile() throws IOException { 
		try(BufferedReader br=new BufferedReader(new FileReader("test.txt"))) {
			String line;
			while((line=br.readLine())!=null) 
				System.out.println(line);
			
		}

	}
	  public static void main(String[] args) {
		
	
	try {
		readFile();
	}catch(IOException e) {
		System.out.println("File error"+e.getMessage());
	}
}}