package seleniumproject;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@SuppressWarnings("unused")
public class Robo {
     
	 static final CharSequence jayachandrapallikonda = null;
	 static final CharSequence JayachandrraPallikonda_777 = null;

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\projects QA\\MavenProject\\chrome drivers\\chromedriver_win32\\chromedriver.exe");
    @SuppressWarnings("unused")
	WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://accounts.google.com/v3/signin/identifier?dsh=S228046%3A1668513551435966&elo=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&ifkv=ARgdvAuDjf8LTxom0frO_Yr-VLJGfFmOOzG0nCHRW7u1QRFRThCvEJMv7hL7A3EfthwHMB_iNh1asg");
	driver.manage().window().maximize();
	driver.findElement(By.name("identifier")).sendKeys(jayachandrapallikonda);
	  Robot robot = new Robot();
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
	   Thread.sleep(500);
	driver.findElement(By.name("Passwd")).sendKeys(JayachandrraPallikonda_777); 
	  Robot robot1 = new Robot();
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
	

}
