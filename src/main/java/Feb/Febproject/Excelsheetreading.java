package Feb.Febproject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excelsheetreading 
{
	

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		By Emailid=By.id("email");
		By password=By.id("pass");
		 By login=By.name("login");
		
		 
		String path="C:\\Users\\chandra sekhar n\\OneDrive\\Documents\\seleniumexcel.xlsx";
		FileInputStream fs= new FileInputStream(path);
	    XSSFWorkbook wb= new XSSFWorkbook(fs);
	    XSSFSheet sheet= wb.getSheet("seleniumexcel");
	    int rows=sheet.getFirstRowNum();
	    for(int i=1;i<=rows;i++) {
	    	XSSFRow row=sheet.getRow(i);
//	    	Emailid= row.getCell(0).getStringCellValue();
//	    	password1=row.getCell(1).getStringCellValue();
//	    	
//	    	
//	    	
//	    }
//	    public static void EnterEmailid(String Emailid1)
//	    {
//	    	driver.findElement(Emailid1).sendKeys(Email);
//	    }
//	    public static void EnterPassword(By password1)
//	    {
//	    	driver.findElement(password1).sendKeys(password1);
//	    }
//	    
//	    
//	    
//
//	}
//
	    }
	}
}


	
