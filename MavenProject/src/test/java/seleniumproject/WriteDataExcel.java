package seleniumproject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("unused")
public class WriteDataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="//C:";
		String fileName="Jaysheet1.xls";
		String sheetName="Sheet1";
		String[] valueToWrite = {"Jayachandrra","jai123"};
	
		File file = new File(filePath+"\\"+fileName);
	    

	    FileInputStream inputStream = new FileInputStream();

	    Workbook workBook = null;
	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    if(fileExtensionName.equals(".xlsx"))
	    {
         workBook = new HSSFWorkbook(inputStream);

	    }
        else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of HSSFWorkbook class

	    	workBook = new XSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet sheet = workBook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    Row row = sheet.getRow(0);

	    //Create a new row and append it at last of sheet

	    Row newRow = sheet.createRow(rowCount+1);

	    //Create a loop over the cell of newly created Row

	    for(int j = 0; j < row.getLastCellNum(); j++){

	        //Fill data in row

	        Cell cell = newRow.createCell(j);

	        cell.setCellValue(valueToWrite[j]);

	    }

	    //Close input stream

	    inputStream.close();

	    //Create an object of FileOutputStream class to create write data in excel file

	    FileOutputStream outputStream = new FileOutputStream(file);

	    //write data in the excel file

	    workBook.write(outputStream);

	    //close output stream

	    outputStream.close();

}
	}


