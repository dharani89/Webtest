package Com.Test.Dharani.utils;

public class FileReaderManager {
	
	private static FileReaderManager fileReader = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static JsonReader jsonReader;
	
	private FileReaderManager() {
	}
	
	 public static FileReaderManager getInstance( ) {
	      return fileReader;
	 }
	 
	 public ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	 }
	 
	 public JsonReader getJsonReader(){
		 return (jsonReader == null) ? new JsonReader() : jsonReader;
	}
}