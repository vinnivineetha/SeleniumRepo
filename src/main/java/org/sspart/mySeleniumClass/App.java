package org.sspart.mySeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver","C:/Users/vinni/Downloads/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");
        
	   driver.findElement(By.linkText("Customer Service")).click();
	   driver.findElement(By.xpath("//a[contains(text(),'Your Orders')]")).click();
	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vineethag207@gmail.com");
	   driver.findElement(By.xpath("//input[@id='continue']")).click();
	   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("august20");
	   driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
        driver.quit();
    }
}
