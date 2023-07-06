package seleniumproject;
import java.awt.event.KeyEvent;




import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class HrmApp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\projects QA\\MavenProject\\chrome drivers\\chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");

        
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        
        
        WebDriverWait wait= new WebDriverwait(driver,90);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type='submit']"));
       // driver.findElement(By.xpath("//button[@type='submit']")).click();
        //@SuppressWarnings("unused")
		//Robot robot = new Robot();
       // robot.keyPress(KeyEvent.VK_ENTER);
      // robot.keyRelease(KeyEvent.VK_ENTER);
        
       // driver.close();
        
        
        
	}

}

