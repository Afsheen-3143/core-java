package unchecked;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Files1 {
	public static void main(String args[]) throws IOException {
      File file = new File("./demo1.txt");
      if(!file.exists()) {
    	  file.createNewFile();
    	  }
      //scanner
//      Scanner scanner=new Scanner(file);
//      String text = new String();
//      while(scanner.hasNextLine()) {
//    	  text +=scanner.nextLine();
//      }
//      System.out.println(text);
      //fileinput stream
//    	  FileInputStream fis=new FileInputStream(file);    	  

//    	  String text = new String();
//    	  int ascii;
//    	  while((ascii= fis.read())!= -1) {
//    		 text += (char)ascii;
//    		  
//    	  }
//    	  System.out.println(text); 
//    	  fis.close();
      FileInputStream fis=new FileInputStream(file);   
      InputStreamReader isr=new  InputStreamReader(fis);
      BufferedReader br=new BufferedReader(isr);
      String text=new String();
      String line=new String();
      while((line=br.readLine())!=null) {
    	  text+=line +"\n";
      }
    	System.out.println(text.toUpperCase());
    	fis.close();
    	isr.close();
    	br.close();
      
      }
	
	
	}
		