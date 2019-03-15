package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTimeTrackPage;
import page.LicensePage;
import page.LoginPage;

public class CheckIssueDate extends BaseTest {
	@Test(priority=3)
	public void TestIssueDate() {
		String un = Excel.getData(XL_PATH,"CheckIssueDate",1,0);
		String pw = Excel.getData(XL_PATH,"CheckIssueDate",1,1);
		String iDate = Excel.getData(XL_PATH,"CheckIssueDate",1,2);
		
		//Enter valid user name
		LoginPage l = new LoginPage(driver);
		l.setUserName(un);
		
		//Enter valid password
		l.setPassword(pw);
		//Click login
		l.clickLogin();
		//Click on settings
		EnterTimeTrackPage e =new EnterTimeTrackPage(driver);
		e.clickSettings();
		//Click licenses
		e.clickLicenses();
		//verify issue date
		LicensePage license = new LicensePage(driver);
		license.verifyIssueDate(iDate);
	}
	

}
