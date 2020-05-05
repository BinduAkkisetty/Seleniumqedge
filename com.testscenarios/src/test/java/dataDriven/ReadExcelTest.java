package dataDriven;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import primusbankobjects.ExcelUtil;

public class ReadExcelTest {

	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		ExcelUtil bl=new ExcelUtil("C:\\Users\\User\\Desktop\\QedgeSel\\com.testscenarios\\src\\main\\resources\\config\\TestExcel.xls", 0);
	    int size=bl.NumberOfRows();
	    for(int i=1;i<=size;i++)
	    {
	    	String username=bl.getCellValue(i, 0);
	    	String pswd=bl.getCellValue(i, 1);
	    	if(username.equalsIgnoreCase("Admin")){
	    		driver.findElement(By.id("txtuId")).sendKeys(username);
			}
			if(pswd.equalsIgnoreCase("Admin")){
			driver.findElement(By.id("txtPword")).sendKeys(pswd);
			}
	    	}
	    
		driver.findElement(By.id("login")).click();
		driver.close();
	}

}
