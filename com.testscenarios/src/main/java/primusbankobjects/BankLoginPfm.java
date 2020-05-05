package primusbankobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankLoginPfm {
 WebDriver driver;
	public BankLoginPfm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="txtuId")
	WebElement userid;
	@FindBy(name="txtPword")
	WebElement pswd;
	@FindBy(id="login")
	WebElement submit;
	

	public void EnterUserId() {
		userid.sendKeys("Admin");
		
	}

	public void EnterPswd() {
		pswd.sendKeys("Admin");
	}

	public void ClickSubmit() {
		submit.click();
		
	}

}
