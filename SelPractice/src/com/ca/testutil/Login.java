package com.ca.testutil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
 public static WebDriver driver;
 
   @BeforeTest
   public static void beforeMethod1()
   {
	   System.out.println("before method");
   }
 
	@Test
	public static void login()
	{
		// TODO Auto-generated method stub
		
		driver= new FirefoxDriver();
		driver.get("http://ca31.ca.com:48020/Chorus");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='lgnfrm-textfield-username-input']")).sendKeys("flow100");
		driver.findElement(By.xpath(".//*[@id='lgnfrm-textfield-password-input']")).sendKeys("flowqa");
		driver.findElement(By.xpath(".//*[@id='lgnfrm-button-login']/tbody/tr[2]/td[2]/em/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='wrkspc-button-logoutbutton']")).click();
		
		

	}
	@AfterTest
	public static void logout()
	{
		driver.quit();
	}

}
