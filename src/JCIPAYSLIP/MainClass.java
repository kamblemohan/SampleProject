package JCIPAYSLIP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan\\OneDrive\\Desktop\\eclipse-dsl-2020-03-R-win32-x86_64\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://stmess.sahajapps.com/Default.aspx");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream File=new FileInputStream("C:\\Users\\Mohan\\OneDrive\\Desktop\\New folder\\ExcelSheet\\Paramaterization.xlsx");
		Sheet Sh=WorkbookFactory.create(File).getSheet("DDF");
		
		String Username=Sh.getRow(0).getCell(0).getStringCellValue();
		String Password=Sh.getRow(1).getCell(0).getStringCellValue();
		String UserID=Sh.getRow(2).getCell(0).getStringCellValue();
	
		example_LoginPage Login=new example_LoginPage(driver);
		Login.inpUsername(Username);
		Login.inpPassword(Password);
		Login.Submit();
		
		example_HomePage VerifyUI=new example_HomePage(driver);
		VerifyUI.VerifyUI(UserID);
	}

}
