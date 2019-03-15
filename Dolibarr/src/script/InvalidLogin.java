package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

//Follow steps to create test case to automation script
public class InvalidLogin extends BaseTest {
	@Test(priority = 2)
	public void TestInvalidLogin() throws InterruptedException {
		int rc = Excel.getRowCount(XL_PATH, "InvalidLogin");
		for (int i = 1; i <= rc; i++) {
			String un = Excel.getData(XL_PATH, "InvalidLogin", i, 0);
			String pw = Excel.getData(XL_PATH, "InvalidLogin", i, 1);
			Reporter.log("UN:" + un, true);
			Reporter.log("PW:" + pw, true);
			// Enter invalid user name
			LoginPage l = new LoginPage(driver);
			l.setUserName(un);

			// Enter invalid password
			l.setPassword(pw);

			// Click on login
			l.clickLogin();

			// Check error msg is displayed r not
			Thread.sleep(1000);
			l.verifyErrMsgDisplayed();
			Thread.sleep(1000);

		}
	}
}
