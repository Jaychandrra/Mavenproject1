package exceloperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;


public class ReadDataFromExcel {

	@SuppressWarnings("incomplete-switch")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      String excelFilePath=".\\datafiles\\countries population.xlsx";
      FileInputStream inputstream= new FileInputStream(excelFilePath);
      @SuppressWarnings({ "unused", "resource" })
	XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
    @SuppressWarnings("unused")
	XSSFSheet sheet = workbook.getSheetAt(0);  
      
     @SuppressWarnings("unused")
	int rows = sheet.getLastRowNum();
    @SuppressWarnings("unused")
	int cols =  sheet.getRow(1).getLastCellNum();
    
    for(int r=0;r<=rows;r++)
    {
      @SuppressWarnings("unused")
	XSSFRow row = sheet.getRow(r);
      
    	/*for(int c=0;c<cols;c++)
    	{
    		@SuppressWarnings("unused")
			XSSFCell cell = row.getCell(c);
    		
    		switch(cell.getCellType())
    		{
    		case STRING: System.out.print(cell.getStringCellValue()); break;
    		case NUMERIC:System.out.print(cell.getNumericCellValue()); break;
    		case BOOLEAN:System.out.print(cell.getBooleanCellValue()); break;	
    		}
    		System.out.print("  |   "); 
    		
    	}
    	
    	
    	System.out.println(); */
      @SuppressWarnings({ "unused", "rawtypes" })
	Iterator iterator = sheet.iterator();
      
      while(iterator.hasNext())
      {
    	  XSSFRow row1 = (XSSFRow) iterator.next();
    	  
    	  @SuppressWarnings("rawtypes")
		Iterator cellIterator = row1.cellIterator();
    	  
    	  while(cellIterator.hasNext())
    	  {
    		  XSSFCell cell = (XSSFCell) cellIterator.next();
    		  
    		  switch(cell.getCellType())
    		  
    		  {
    		  case STRING: System.out.print(cell.getStringCellValue()); break;
    		  
      		  case NUMERIC:System.out.print(cell.getNumericCellValue()); break;
      		  
      		  case BOOLEAN:System.out.print(cell.getBooleanCellValue()); break;	
    		  
    		  
    		  
    		  }
    		  System.out.print("   |   ");
    		  
    	  }
    	  System.out.println("   |   ");
    	  
    	  
      }
    	
    }
      
      
      
	}
	

}
