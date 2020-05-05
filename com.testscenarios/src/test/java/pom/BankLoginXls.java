package pom;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class BankLoginXls {

	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		File f = new File("C:\\Users\\User\\Desktop\\QedgeSel\\com.testscenarios\\src\\main\\resources\\config\\ExcelTest3.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		int rows = s.getRows();
		System.out.println(rows);
		int cols = s.getColumns();
		System.out.println(cols);
		for (int i = 1; i < rows; i++)
		{
	
				String username = s.getCell(0, i).getContents();
				String pswd=s.getCell(1,i).getContents();
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


