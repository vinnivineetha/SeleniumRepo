package org.sspart.mySeleniumClass;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class FirstTestngClass  {
	 WebDriver driver=null;
	 Properties properties=null;
  @BeforeTest
  public void beforetest(){
	  System.out.println(" i am in before test");
	  System.setProperty("webdriver.chrome.driver","C:/Users/vinni/Downloads/chromedriver.exe");
       driver=new ChromeDriver();
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
      properties=new Properties();
      File file =new File("resources/MyLocator.locator");
      
      try {
		properties.load(new FileInputStream(file));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  

		@AfterTest
		public void aftertest(){
			System.out.println("i am in after test");
			driver.quit();
		}
			  
		@Test
		public void testCase001() {
			
			System.out.println("i am in test001");
			
			driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("vivo");
			driver.findElement(By.xpath("//input[@value='Go']")).click();
			   try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Go']")).isDisplayed(), true);

    }
		
		
			  
		@Test
		public void testCase002(){
			
			   
			System.out.println("i am in test002");
			driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("vivo");
			driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).clear();
		//	driver.findElement(By.xpath("//input[@value='Go']")).click();
			driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("apple");
			   try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		
		
			
		}
	
