package com.org.pageactions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.Reporter;

public class CaptureScreenshot {
	
	static String fileName=null;
	
	public static void takeScreenshot(WebDriver driver,String nameoffile) throws IOException {
		TakesScreenshot snap=(TakesScreenshot) driver;
		fileName="./Screenshots/"+nameoffile+".png";
		File f= snap.getScreenshotAs(OutputType.FILE);
		File fd=new File(fileName);
		FileUtils.copyFile(f, fd);
		attachscreenshot();
	}
	
	public static void attachscreenshot() {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		File f=new File(fileName);
		Reporter.log("<a title= \"Snapshot\" href=\"" + f.getAbsolutePath() + "\">" + 
						"<img width=\"418\" height=\"240\" alt=\"alternativeName\" title=\"title\" src=\"../surefire-reports/html/screenshots/"+fileName+"\"</a>");

	}
		

	}


