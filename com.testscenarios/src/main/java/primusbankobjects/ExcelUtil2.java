package primusbankobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil2{
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	public  ExcelUtil2(String FilePath,int index) throws Exception{
		FileInputStream Fis=new FileInputStream(FilePath);
		 workbook=new XSSFWorkbook(Fis);
		 sheet=workbook.getSheetAt(index);
	}
	public String getCellValue(int rowIndex,int colIndex){
		XSSFRow row=sheet.getRow(rowIndex);
		XSSFCell cell=row.getCell(colIndex);
		return cell.toString();
	}
	public int NumberOfRows(){
		return sheet.getLastRowNum();
		
	}
}
