package primusbankobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtil{
	
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	
	public  ExcelUtil(String FilePath,int index) throws Exception{
		FileInputStream Fis=new FileInputStream(FilePath);
		 workbook=new HSSFWorkbook(Fis);
		 sheet=workbook.getSheetAt(index);
	}
	public String getCellValue(int rowIndex,int colIndex){
		HSSFRow row=sheet.getRow(rowIndex);
		HSSFCell cell=row.getCell(colIndex);
		return cell.toString();
	}
	public int NumberOfRows(){
		return sheet.getLastRowNum();
		
	}
}
