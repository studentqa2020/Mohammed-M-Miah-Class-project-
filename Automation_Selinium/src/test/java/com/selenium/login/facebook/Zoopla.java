package com.selenium.login.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoopla {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mohammedmiah/Downloads/chromedriver" );
		
		WebDriver driver=new ChromeDriver();//upcasting polymorphism
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zoopla.co.uk/");
		
		driver.findElement(By.xpath("//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
		
		//class='ui-button-primary ui-cookie-accept-all-medium-large'
		driver.findElement(By.xpath("//*[@class='button button--tertiary-dark account-link__text']")).click();
		
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("mhmiah9@yahoo.com");
		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Mistermoe123");
		
		driver.findElement(By.xpath("//*[@id='signin_submit']")).click();
		
		System.out.println(driver.getTitle());
		
	}

}
