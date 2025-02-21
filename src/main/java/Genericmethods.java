import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import FbStepdefincation.BaseNP;

public class Genericmethods extends BaseNP {

	
		public static void Click(WebElement element)
		{
			//element.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);

	}

}
