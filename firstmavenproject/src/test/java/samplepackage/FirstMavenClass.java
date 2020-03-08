package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMavenClass {


	
	@Test
	public void test1()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
			
			ChromeDriver dr = new ChromeDriver();   //constructor
			
			
			dr.manage().window().maximize();
			
		   dr.get("http://sampleapp.tricentis.com/101/");
			
		   dr.findElement(By.xpath("//a[text()='Automobile']")).click();
		 
		   dr.findElement(By.xpath("//button[@id='opendateofmanufacturecalender']")).click();
		   
		
	}
	
	

}
