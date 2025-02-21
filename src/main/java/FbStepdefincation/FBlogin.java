package FbStepdefincation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class FBlogin extends BaseNP {
	static By FBEmailid=By.id("email");
	static By FBpasswordid=By.id("pass");
	static By login=By.name("login");
	
	public static void EnterEmailid(String Email)
	{
		driver.findElement(FBEmailid).sendKeys(Email);
	}
	public static void EnterPassword(String password)
	{
		driver.findElement(FBpasswordid).sendKeys(password);
		
	}
	public static void Click(WebElement element)
	{
		//element.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

}
	public static void Login()
	{
	
	driver.findElement(login).click();
	}
	
	public static String Takescreenshot() throws IOException {
		TakesScreenshot tc=(TakesScreenshot)driver;
		
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
		
		File destfile=new File("C:\\Users\\chandra sekhar n\\OneDrive\\Documents\\SS"+"ScreenCapture"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(scrfile, destfile);
		
	String srcpath=destfile.getAbsolutePath();
		
		return srcpath;
		
	}
		
}


	


