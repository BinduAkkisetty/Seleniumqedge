package dataDriven;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import primusbankobjects.ExcelUtil;
import primusbankobjects.ExcelUtil2;

public class ReadXslxTest {

	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		ExcelUtil2 el=new ExcelUtil2("C:\\Users\\User\\Desktop\\QedgeSel\\com.testscenarios\\src\\main\\resources\\config\\TestExcel1.xlsx",0);
		int size=el.NumberOfRows();
		for(int i=1;i<=size;i++){
			String username=el.getCellValue(i, 0);
			String pswd=el.getCellValue(i, 1);
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
	


