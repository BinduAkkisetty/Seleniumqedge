package TestScenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenSHot {
  @Test
  public void f() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://book.spicejet.com/");
	  driver.manage().window().maximize();
	  //takescreenshot is an interface whic needs a reference so used driver.it has a method get screen shot as.
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//capturing screen shot
	  //have to give path to save the screenshot which is captured
	  FileUtils.copyFile(f, new File("C:\\Users\\User\\Desktop\\QedgeSel\\com.testscenarios\\target\\ScreenShot.png"));
	  
  }
}
