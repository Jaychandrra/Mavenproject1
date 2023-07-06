package TestNgExamples;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchEmployee {
	WebDriver driver = new ChromeDriver();
    
    @BeforeMethod
    void login()throws InterruptedException
    {   System.setProperty("webdriver.chrome.driver", "C:\\projects QA\\MavenProject\\chrome drivers\\chromedriver_win32//chromedriver.exe");
        
    	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	CharSequence Admin = null;
		driver.findElement(By.name("username")).sendKeys(Admin);
		CharSequence admin123 = null;
		driver.findElement(By.name("password")).sendKeys(admin123);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Admin"));
    }
   void search(String UserName)
   {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
	  driver.findElement(By.xpath("//button[@type='submit'"));
	  String actualResult=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div/div[2]")).getText();
      String expectedResult = "Admin";
      SoftAssert softassert = new SoftAssert();
      softassert.assertEquals(actualResult,expectedResult);
   }
   void search (int index)
   {
	   WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
	   Select select = new Select(element);
	   select.selectByIndex(index);
   }
   void search (String UserName,String empName)
   {
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(UserName);
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys(empName);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   String expectedempName = "Paul collings";
	   String actEmpName = null;
	   String actEmpName = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[1]/div[1]/div/div/div[2]"));
	   SoftAssert softassert = new SoftAssert();
	   softassert.assertEquals(actEmpName,expectedempName);
	   
   }
  @Test()
  void  searchWithUserName()
  {
	  search("Admin");
  }
  
  @Test()
  void searchUserRole()
  {
	  search("1");
  }
  @Test()
  void searchEmpNameAndUserName()
  {
	  search("Admin","Paul collings");
  }
     
  @AfterMethod()

  void logout() 
  {
	  
	  driver.findElement(By.linkText("Logout")).click();
  }
  


} 

