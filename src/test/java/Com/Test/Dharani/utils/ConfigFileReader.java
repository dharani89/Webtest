package Com.Test.Dharani.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath= "configs//configuration.properties";

	
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getTestDataPath(){
		String testDataPath = properties.getProperty("testDataPath");
		if(testDataPath!= null) return testDataPath;
		else throw new RuntimeException("Test DataPath not specified in the Configuration.properties file for the Key:testDataPath");		
	}
	public String getNewName(){
		String newName = properties.getProperty("newName");
		if(newName!= null) return newName;
		else throw new RuntimeException("newName not specified in Configuration.properties file for the Key:newName");		
	}
	public String getUserName(){
		String userName = properties.getProperty("userName");
		if(userName!= null) return userName;
		else throw new RuntimeException("userName not specified in Configuration.properties file for the Key:userName");		
	}
}