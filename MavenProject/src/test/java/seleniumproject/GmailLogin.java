package seleniumproject;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\projects QA\\MavenProject\\chrome drivers\\chromedriver_win32//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
    driver.navigate().to("https://www.google.com/");
   
    
    driver.navigate().to("https://accounts.google.com/v3/signin/identifier?dsh=S-1375322456%3A1666867869858266&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWqi45NlsEUCGZTvarGH67aObvvhU557ltVYqOYqggOJP4b7CDcJWPhOTmGTCCY4f34nuF47pw");
    Thread.sleep(1000);
    driver.manage().window().maximize();
    driver.findElement(By.linkText("No thanks")).click();
   Alert alert = driver.switchTo().alert();
  String textOnAlert=alert.getText();
  System.out.println(textOnAlert);
   alert.dismiss(); 
	driver.findElement(By.id("email")).sendKeys("jayachandrapallikonda");
	driver.findElement(By.name("password")).sendKeys("JayachandrraPallikonda_777");
    driver.findElement(By.linkText("Next")).click();
   driver.close();
    
    
	}

}
