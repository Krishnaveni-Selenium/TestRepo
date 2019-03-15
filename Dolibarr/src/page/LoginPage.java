package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	@FindBy(name = "username")
	private WebElement unTB;

	@FindBy(name = "pwd")
	private WebElement pwTB;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginBTN;

	@FindBy(xpath = "//span[contains(text(),'invalid')]")
	private WebElement errMsg;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String un) {
		unTB.sendKeys(un);
	}

	public void setPassword(String pwd) {
		pwTB.sendKeys(pwd);
	}

	public void clickLogin() {
		loginBTN.click();
	}

	public void verifyErrMsgDisplayed() {
		// To compare strings or any other we write Assertequals()
		// boolean actual = errMsg.isDisplayed();
		// Assert.assertEquals(actual, true);

		// assertTrue is used only for boolean
		Assert.assertTrue(errMsg.isDisplayed());

	}

}
