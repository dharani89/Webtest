package Com.Test.Dharani.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import Com.Test.Dharani.POJO.SignIn;

public class JsonReader {
	
private final String signInFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataPath() + "SignIn.json";

private List<SignIn> signInList;

public JsonReader(){
	signInList = getSigninData();
}

private List<SignIn> getSigninData() {
	Gson gson = new Gson();
	BufferedReader bufferReader = null;
	try {
		bufferReader = new BufferedReader(new FileReader(signInFilePath));
		SignIn[] customers = gson.fromJson(bufferReader, SignIn[].class);
		return Arrays.asList(customers);
	}catch(FileNotFoundException e) {
		throw new RuntimeException("Json file not found at path : " + signInFilePath);
	}finally {
		try { if(bufferReader != null) bufferReader.close();}
		catch (IOException ignore) {}
	}
}
	
public final SignIn getCustomerByName(String customerName){
		
		for(SignIn customer : signInList) {
			
			if(customer.firstName.equalsIgnoreCase(customerName)) return customer;
		}
		return null;
}


}