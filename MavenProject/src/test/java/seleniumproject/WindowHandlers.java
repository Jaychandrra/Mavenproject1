package seleniumproject;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class WindowHandlers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\projects QA\\MavenProject\\chrome drivers\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.irctctourism.com/");
		  String parentWindow=driver.getWindowHandle();
		 // System.out.println("Parent window id:" +parentWindow);
		  String title=driver.getTitle();
		 // System.out.println("Parent window title is : " +title);
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Bus Tickets")).click();
		  ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  Thread.sleep(500);
		  String pTitle=driver.getTitle();
		  System.out.println("Title is : " +pTitle);
		  
	}

}
