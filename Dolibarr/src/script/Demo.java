package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;


public class Demo extends BaseTest {
	@Test
	public void testDemoA()
	{
		//calling row count method
		int rc = Excel.getRowCount(XL_PATH, "Sheet1");
	    Reporter.log("Row count:" +rc,true);
		String v = Excel.getData(XL_PATH,"Sheet1",0,0);
		//Reporter.log("Demo",true);
		Reporter.log(v,true);
		Assert.fail();
	}
	
	
	

}
