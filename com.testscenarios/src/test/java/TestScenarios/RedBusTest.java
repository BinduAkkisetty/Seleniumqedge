package TestScenarios;

import static org.junit.Assert.*;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusTest {

	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("H");
		
	
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("B");
		
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//button[contains(text(),'>')]")).click();
		driver.findElement(By.xpath("//td[@class='wd day' and text()='1']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
	}

}
