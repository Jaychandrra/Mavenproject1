package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","C:\\projects QA\\MavenProject\\chrome drivers\\chromedriver_win32//chromedriver.exe");
     @SuppressWarnings("unused")
	WebDriver driver = new ChromeDriver();
     driver.navigate().to("https://www.google.com/");
     driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().window().maximize();
     Thread.sleep(500);
     driver.findElement(By.name("username")).sendKeys("Admin");
     driver.findElement(By.name("password")).sendKeys("admin123");
     Thread.sleep(500);
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     @SuppressWarnings("unused")
	WebDriverException wait = new WebDriverException();
     @SuppressWarnings("unchecked")
	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
    boolean status = element.isDisplayed();
    if (status) {
    	System.out.println("webdriver is visible");
    
    }
    else {
    	System.out.println("webdriver is Not visible");
    	
    }
	} 

}
