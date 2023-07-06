package seleniumproject;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;

import seleniumproject.ReadDataFromExcel;

public class WriteDataToExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadDataFromExcel objExcelFile = new ReadDataFromExcel();
		     String filePath =
		     String fileName =
		     String SheetName =
		     String[] valueToWrite = 
		     File file = new file(filePath+"\\"+fileName);
		     FileInputStream inputStream = new FileInputStream(file);
		     Workbook workbook = null;
		     String FileExtensionName = fileName.substring()
	}

}
