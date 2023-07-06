package seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","");
       @SuppressWarnings("unused")
	   WebDriver driver=new ChromeDriver();
       driver.navigate().to("");
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
       driver.navigate().to("");
       driver.manage().window().maximize();
	}  

}
