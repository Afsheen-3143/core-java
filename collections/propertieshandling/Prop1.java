package propertieshandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Prop1 {
	public static void main(String[] args) throws IOException {
		File file = new File("dbconfig.properties");
		if(!file.exists()) {
//		file.exists();
//		System.out.println(file.exists());
			file.createNewFile();
			
		}
		
			Properties prop=new Properties();
			
		prop.setProperty("url","localhost");
		prop.setProperty("username","affu");
		prop.setProperty("password","afsheen123");
		prop.remove("url");
		prop.setProperty("url","76524050");
		prop.put("affu","teja");
	
		
		FileOutputStream fos=new FileOutputStream(file);
		BufferedOutputStream bos=new BufferedOutputStream (fos);
		prop.store(fos, "new property file");
//		print key,values in the console
		FileInputStream fis=new FileInputStream(file);
		BufferedInputStream bos1=new BufferedInputStream (fis);
		prop.load(fis);
//		update values
		prop.setProperty("username","teja");
		prop.remove("url");
			Set<String>key=prop.stringPropertyNames();
			Set<Object>key1=prop.keySet();
			System.out.println(key1);
Collection<Object>c=prop.values();
System.out.println(c);
//print values of particular key
System.out.println(prop.getProperty("url"));
//get both keys,values
System.out.println(prop);
for (Object keys : prop.keySet()) {
	System.out.println(keys+">>>>>"+prop.getProperty((String)keys));
	
}
	Set<Entry<Object,Object>>Data=prop.entrySet();
	for(Entry<Object,Object>d: Data) {
		System.out.println(d.getKey()+">>>>"+d.getValue());
		prop.isEmpty();
		prop.clear();
		System.out.println(prop);
		System.out.println(prop.contains("url"));
	}
	}
}