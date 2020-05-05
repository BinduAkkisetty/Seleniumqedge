package TestScenarios;

import static org.junit.Assert.*;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoitTest {

	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://easyupload.io/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h5[@class='title']")).click();
		Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\upload1.exe");
		Thread.sleep(2000);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\User\\Desktop\\QedgeSel\\com.testscenarios\\target\\ScreenShot2.png"));
			
		driver.close();
	}

}
