package unchecked;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Files2 {
public static void main(String args[]) throws Exception {
	File file=new File("./demo1.txt");
	if(!file.exists()) {
		
			file.createNewFile();}
	String s="afsheentejarenukauma";
//			FileOutputStream fos=new FileOutputStream(file);
//		for(char ch: s.toCharArray()) {
//			fos.write((int)ch);
//		}
//			fos.close();
//		}}
//	
	//filewriter
FileWriter fw=new FileWriter(file);
//fw.write(s);
//fw.close();
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(s);
	bw.close();
}}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			


