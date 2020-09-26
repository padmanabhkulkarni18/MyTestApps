package test.list;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ACPropertiesReader {
	static Properties prop = new Properties();
	
	static String propFileName= "D:\\Projects\\MyTestWorkspace\\Test\\resources\\acTempValues.properties";
	public static void main(String[] args) throws IOException {
		
		 loadProperties();
		 int i =30;
		 ACPropertiesReader acpr= new ACPropertiesReader();
		 String a= acpr.getPropertyValue(String.valueOf(i));
		 System.out.println("lookup string value : "+ a);
		 int acTempLookupValue= Integer.parseInt(a);
		 System.out.println("lookup integer value : "+ acTempLookupValue);
		 String s = Integer.toString(i);
		 if(prop.containsKey(s)){
			 System.out.println(prop.get(s)); 
		 }
		 
		 
	}
	 public String getPropertyValue(String key){
	        return prop.getProperty(key);
	    }
	private static void loadProperties() throws IOException {
		try (InputStream input = new FileInputStream(propFileName)) {

	            // load a properties file
	            prop.load(input);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

