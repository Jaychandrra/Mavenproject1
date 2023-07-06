package seleniumproject;


import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	private static final CharSequence Jayachandrra = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\projects QA\\MavenProject\\chrome drivers\\chromedriver_win32//chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		String firstname = null;
		driver.findElement(By.name(firstname)).sendKeys(Jayachandrra);
		String lastname =null;
		CharSequence pallikonda = null;
		driver.findElement(By.name(lastname)).sendKeys(pallikonda);
		String reg_email=null;
		CharSequence Jayachandrapallikonda = null;
		driver.findElement(By.name(reg_email)).sendKeys(Jayachandrapallikonda);
	
		String pass;
	    @SuppressWarnings("unused")
		Object Jayachandrrapallikonda = null;
		pass = null;
		driver.findElement(By.name(pass)).sendKeys(Jayachandrapallikonda);
		
		Thread.sleep(1000);
		WebElement day= driver.findElement(By.id("day"));
		Select dropday=new Select(day);
		dropday.selectByVisibleText("12");
       // driver.close();
	}

}
