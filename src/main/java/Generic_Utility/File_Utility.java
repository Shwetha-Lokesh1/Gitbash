package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility {
	
	//this method is used to fetch the common data in application
	//@param key
	//@return
	//@throws throwable
	
	public String getKeyAndValue(String key) throws Throwable
	
	{
		  FileInputStream fis=new FileInputStream("./src/test/resources/AdvseleniumCommonData.properties.txt");
			
			//loading file to properties file
			
			Properties pro=new Properties();
			pro.load(fis);
			String value = pro.getProperty(key);
			return value;
	}

}
