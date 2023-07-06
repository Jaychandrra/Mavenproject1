package seleniumproject;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumproject.XSSFWorkbook;

public class FaceBookReadFromExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="//D:";
		String fileName="FaceBookTestData.xlsx";
		String sheetName="Sheet1";
		//Create an object of File class to open xlsx file

	    File file = new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook workBook = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    	workBook = new XSSFWorkbook(inputStream);

	    }

	    

	    else if(fileExtensionName.equals(".xls")){

	   

	    	workBook = new HSSFWorkbook(inputStream);

	    }
	    Sheet sheet = workBook.getSheet(sheetName);

	    Row row = sheet.getRow(1);

	    Sheet sheet1 = workBook.getSheetAt(0);
	        Row row = workBook.getRow(1);
        	String userId=row.getCell(0).getStringCellValue();
        	System.out.println(row.getCell(0).getStringCellValue());
        	String passWord=row.getCell(1).getStringCellValue();
        	System.out.println(row.getCell(1).getStringCellValue());
        	System.setProperty("webdriver.chrome.driver", "C:\\projects QA\\MavenProject\\chrome drivers\\chromedrivers_win32\\chromedriver_exe");
 		    WebDriver driver = new ChromeDriver();
 		    driver.get("https://www.facebook.com/");	
 	        driver.findElement(By.name("email")).clear();
 	        driver.findElement(By.name("email")).sendKeys(userId);
 	        driver.findElement(By.name("pass")).clear();
 	        driver.findElement(By.name("pass")).sendKeys(passWord);
 		

	}

}
