package dataDriven;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimusBankProp {

	@Test
	public void test() throws Exception {
		File f=new File("C:\\Users\\User\\Desktop\\QedgeSel\\com.testscenarios\\src\\main\\resources\\config\\global.properties");
		Properties prop=new Properties();
		prop.load(new FileInputStream(f));
		System.out.println(prop.getProperty("userid"));
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuId")).sendKeys(prop.getProperty("userid"));
		driver.findElement(By.id("txtPword")).sendKeys(prop.getProperty("pswd"));
		driver.findElement(By.id("login")).click();
		driver.close();
	}

}
