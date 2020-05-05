package primusbankobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BankLoginPom {
	public static By userid=By.name("txtuId");
	 public static By pswd=By.name("txtPword");
	 public static By submit=By.id("login");
     public static void EnterUserId(WebDriver driver){
		 driver.findElement(BankLoginPom.userid).sendKeys("Admin");
	 }
	 public static void EnterPswd(WebDriver driver){
		 driver.findElement(BankLoginPom.pswd).sendKeys("Admin");
	 }
	 public static void ClickSubmit(WebDriver driver){
		 driver.findElement(BankLoginPom.submit).click();
	 }
	 
	
}
