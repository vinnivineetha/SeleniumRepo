package org.sspart.mySeleniumClass;

import org.openqa.selenium.WebDriver;
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
        driver.get("https://www.amazon.in/");
        driver.quit();
    }
}
