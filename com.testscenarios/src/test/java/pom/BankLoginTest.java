package pom;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import primusbankobjects.BankLoginObject;

public class BankLoginTest {

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		driver.findElement(BankLoginObject.userid).sendKeys("Admin");
        driver.findElement(BankLoginObject.pswd).sendKeys("Admin");
        driver.findElement(BankLoginObject.submit).click();
        driver.close();
	}

}
