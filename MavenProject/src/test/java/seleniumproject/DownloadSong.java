package seleniumproject;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","D:\\Project sw\\chromedriver_win32//chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.navigate().to("https://naasongs.co/veedokkade.html");
     driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
     driver.manage().window().maximize();
     //driver.findElememt(By.)
	}

}
