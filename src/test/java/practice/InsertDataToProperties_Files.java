package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class InsertDataToProperties_Files {
	
	public static void main(String[] args) throws Throwable 
 {
		Properties pro=new Properties();
		
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		pro.setProperty("url", "https://www.saucedemo.com/");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/PropertiesFile.properties.txt");
		
		pro.store(fos, "COMMONDATA");
		System.out.println("data written successfully");
		
		
		
 }
		
		
}
