package pom;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import primusbankobjects.BankLoginPfm;

public class BankLoginPfmTest {

	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		BankLoginPfm pf=new BankLoginPfm(driver);
		pf.EnterUserId();
		pf.EnterPswd();
		pf.ClickSubmit();
		driver.close();
		
	}

}
