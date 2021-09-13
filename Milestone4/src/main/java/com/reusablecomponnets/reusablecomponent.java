package com.reusablecomponnets;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.*;

public class reusablecomponent {
	
	public static WebDriver WebDriver() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",Datadriven.datadriver("driver"));
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}

}
