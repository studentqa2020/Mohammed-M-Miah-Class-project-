package com.selenium.login.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		

	
	System.setProperty("webdriver.chrome.driver", "/Users/mohammedmiah/Downloads/chromedriver" );
	WebDriver driver=new ChromeDriver();//upcasting polymorphism
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");//get() method

	//email input box
	 	
		//driver.findElement(By.xpath("//*[@type='email']")).sendKeys("sarower@gmail.com");
	
		WebElement email=driver.findElement(By.xpath("//*[@type='email']"));
		email.sendKeys("mhmiah9@yahoo.com");
		
		WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
		password.sendKeys("1232343243");
		
		WebElement signinbtn=driver.findElement(By.xpath("//*[@value='Log In']"));
		signinbtn.click();
		
		//close browser
		
		driver.quit();

}

}