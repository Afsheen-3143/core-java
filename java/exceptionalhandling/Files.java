package unchecked;
import java.io.File;
import java.io.IOException;

public class Files {
	public static void main (String args[]) throws IOException {
		File f=new File("./Resources/");
		if(f.exists())
			f.delete();
		
		System.out.println(f.createNewFile());
	System.out.println(f.delete());
		System.out.println(f.exists());
	System.out.println(f.isHidden());
	System.out.println(f.canWrite());
	f.setWritable(true);
	System.out.println(f.canWrite());
	}}

//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Files {
//    public static void main(String[] args) {
//        try {
//            FileWriter writer = new FileWriter("D:\\textfile\\affu.txt");
//            writer.write("Hello, this is a sample text written to a file!");
//            writer.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred while writing.");
//            e.printStackTrace();
//        }}}
//    }
//}
//
