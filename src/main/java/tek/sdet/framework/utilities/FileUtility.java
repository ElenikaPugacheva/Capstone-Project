package tek.sdet.framework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtility {
	// in this class we will create a method that returns
	// object of FileInputStream class so we can read 
	// any file in bytes
	// syntax for creating a method
	//accessmodifier return type and method name (parameteres){}
	public static FileInputStream getFileInputSteam(String filePath) throws FileNotFoundException {
		return new FileInputStream(new File(filePath));
	}
	

}
