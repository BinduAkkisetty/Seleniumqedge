package pom;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import primusbankobjects.BankLoginPom;

public class BankLoginPomTest {

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		BankLoginPom.EnterUserId(driver);
		BankLoginPom.EnterPswd(driver);
		BankLoginPom.ClickSubmit(driver);
		driver.close();
		
	}

}
