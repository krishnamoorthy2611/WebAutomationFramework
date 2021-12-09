/**
 * 
 */
package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author krish
 *
 */
public class FileReadingMethods {

	public String readProperty(String key) throws IOException {
		Properties properties = new Properties();
		InputStream file = new FileInputStream(System.getProperty("user.dir") + File.separator + "config.properties");
		properties.load(file);
		return properties.getProperty(key);
	}

	public void readExcelFile(String sheetName) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(readProperty("ExcelFilePath"));
		XSSFSheet sheet = workbook.getSheet(sheetName);
		// return sheet.getPhysicalNumberOfRows();
		int rows = sheet.getLastRowNum();
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println(rows);
		System.out.println(rowcount);
		System.out.println(cols);
		for(int r = 0 ; r<=rows;r++){
					
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols; c++)
			{
				XSSFCell cell  = row.getCell(c);
				
				switch(cell.getCellType()){
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					 System.out.print(cell.getNumericCellValue());
					 break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				default:
					break;
					
					
				}System.out.print(" | ");
				
			}System.out.println();
			
			}
		
	}

	public void getCellData() {

	}

	public static void main(String[] args) throws IOException {

		FileReadingMethods frm = new FileReadingMethods();
		System.out.println(frm.readProperty("ExcelFilePath"));
		frm.readExcelFile("Sheet1");
	}

}
