package dataDriven;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrimusBankText {

	@Test
	public void test() throws Exception {
		File f=new File("C:\\Users\\User\\Desktop\\QedgeSel\\com.testscenarios\\src\\main\\resources\\config\\text.txt");
		//String str=FileUtils.readFileToString(f);
		//System.out.println(str);
		FileUtils.writeStringToFile(f, "selenium");
		
	}

}
