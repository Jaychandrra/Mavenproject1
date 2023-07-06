import org.openqa.selenium.By;






import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\projects QA\\MavenProject\\chrome drivers\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805424%7Cb%7Cfacebook%20com%20%23%7C&placement=&creative=550525805424&keyword=facebook%20com%20%23&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221352%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-498889442776%26loc_physical_ms%3D9050516%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMImZCvy_-J-wIVyRwrCh0iSg_WEAAYASAAEgJbzPD_BwE");
	 driver.findElement(By.name("firstname")).sendKeys("jayachandrra");
	 driver.findElement(By.name("lastname")).sendKeys("pallikonda");
	 driver.findElement(By.name("reg_email__")).sendKeys("123456789");
	 driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
	 WebDriverWait wt= new WebDriverWait(driver,10);
	 wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Sign Up"));
	 day= driver.findElement(By.name("birth_day"));//sendKeys("13");
	 Select select=new Select(day);
	 select.selectByVisibleText("3");
	 WebElement month= driver.findElement(By.name("birth_month"));//sendKeys("Feb");
	 Select select1=new Select(month);
	 select1.selectByVisibleText("Nov");
	}
	
}
