package JCIPAYSLIP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class example_HomePage 
{
	@FindBy(xpath=("//span[@id='ctl00_lbEmpName']"))private WebElement UI;
	public example_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyUI(String UserID)
	{
		String Actual=UI.getText();
		System.out.println(Actual);
		
		String Expected=UserID;
		
		if(Actual.equals(Expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Different");
		}
	}
}
