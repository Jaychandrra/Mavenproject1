package seleniumproject;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class FaceBookExcel {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="//C:";
		String fileName="jaiTest1.xlsx";
		String sheetName="Sheet1";
	    File file = new File(filePath+"\\projects QA\\Project Excel sheets"+fileName);

	      FileInputStream inputStream = new FileInputStream(file);

	      Workbook workBook = null;

	      String fileExtensionName = fileName.substring(fileName.indexOf("."));

	     if(fileExtensionName.equals(".xlsx")){

	    	workBook = new XSSFWorkbook(inputStream);
    }
         else if(fileExtensionName.equals(".xls")){

	    	workBook = new XSSFWorkbook(inputStream);
 }
	       Sheet sheet = workBook.getSheet(sheetName);

	       Row row = sheet.getRow(1);
        @SuppressWarnings("unused")
		Sheet sheet1 = workBook.getSheetAt(0);
	       //  Row row = workBook.getRow(1);
        	String userId=row.getCell(0).getStringCellValue();
        	System.out.println(row.getCell(0).getStringCellValue());
        	String passWord=row.getCell(1).getStringCellValue();
        	System.out.println(row.getCell(1).getStringCellValue());
        	System.setProperty("webdriver.chrome.driver", "C:\\projects QA\\MavenProject\\chrome drivers\\chromedriver_win32//chromedriver.exe");
 		    WebDriver driver = new ChromeDriver();
 		    driver.get("https://www.facebook.com/");
 		    driver.manage().window().maximize();
 	        driver.findElement(By.id("email")).clear();
 	        driver.findElement(By.id("email")).sendKeys(userId);
 	        driver.findElement(By.name("pass")).clear(); 
 	        driver.findElement(By.name("pass")).sendKeys(passWord); 
	}

}
