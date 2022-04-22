package JCIPAYSLIP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class example_LoginPage 
{
	@FindBy(xpath=("//input[@type='text']"))private WebElement UN;
	@FindBy(xpath=("//input[@type='password']"))private WebElement PWD;
	@FindBy(xpath=("//input[@type='submit']"))private WebElement SubmitBtn;
	
	public example_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpUsername(String Username)
	{
		UN.sendKeys(Username);
	}
	
	public void inpPassword(String Password)
	{
		PWD.sendKeys(Password);
	}
	
	public void Submit()
	{
		SubmitBtn.click();
	}
	
}
