package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AutoLib {
	public static void getPhoto(WebDriver driver,String path)
	{
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcfile = t.getScreenshotAs(OutputType.FILE);
		File destfile = new File(path);
		
		try {
		FileUtils.copyFile(srcfile,destfile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
