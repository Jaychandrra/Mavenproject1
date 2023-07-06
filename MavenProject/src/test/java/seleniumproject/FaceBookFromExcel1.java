package seleniumproject;
import java.awt.Robot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookFromExcel1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       @SuppressWarnings("unused")
	String filepath ="//C:";
       @SuppressWarnings("unused")
	String fileName ="JaiTest1.xlsx";
       @SuppressWarnings("unused")
	String sheetName ="sheet1";
       File file = new File(filepath+"\\"+fileName);
       @SuppressWarnings("unused")
	FileInputStream inputStream = new FileInputStream(file);
       @SuppressWarnings("unused")
	Workbook workBook = null;
       @SuppressWarnings("unused")
	String FileExtensionName = fileName.substring(fileName.indexOf("."));
       if(FileExtensionName.equals("xlsx")) {
   XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
       }
    	  else if(FileExtensionName.equals("xls")) {
    		  workBook = new HSSFWorkbook(inputStream);
    	  }
      
	@SuppressWarnings("rawtypes")
	Sheet sheet =  workBook.getSheet(sheetName);
	  Row row = sheet.getRow(1);
	  
	  String userId =row.getCell(0).getStringCellValue();
	  System.out.println(row.getCell(0).getStringCellValue());
	  String passWord = row.getCell(1).getStringCellValue();
	  System.out.println(row.getCell(1).getStringCellValue());
	  System.setProperty("webdriver.chrome.driver","C:\\projects QA\\MavenProject\\chrome drivers\\chromedriver_win32//chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com/login/");
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(userId);
	  driver.findElement(By.name("pass")).clear();
	  driver.findElement(By.name("pass")).sendKeys(passWord);
	  
	  
	  
      
    	  }
    	  
    	   
       
       
       
       
       
       
       
	}


