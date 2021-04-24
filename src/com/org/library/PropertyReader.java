package com.org.library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String fetchDetails(String key) throws IOException {
			
	Properties pr =new Properties();
	File f=new File("./PropFiles/Xpath.properties");
	FileReader fr=new FileReader(f);
	pr.load(fr);
	return pr.get(key).toString();
	}
}
