package packagemaven.Project_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;
	//step 1
	@FindBy(id="ap_email") WebElement username;
	@FindBy(id="continue") WebElement continue_button;
	@FindBy(name="password") WebElement password;
	@FindBy(id="signInSubmit") WebElement signin_button;
	
	@FindBy(xpath ="//h4[(text()='Incorrect phone number')]") WebElement incorrect_phone_error;
	@FindBy(xpath ="//h4[(text()='There was a problem')]") WebElement incorrect_email_error;
	@FindBy(xpath ="//span[contains(text(),'password is incorrect')]") WebElement incorrect_password_error;
	

	//step 2
	public void un()
	{
		username.sendKeys("9922510362");	
	}
	public void cnt()
	{
		continue_button.click();
	}
	public void pwd()
	{
		password.sendKeys("Iamback@123");
		
	}
	public void signin()
	{
		signin_button.click();
	}
	public void wrong_un()
	{
		username.sendKeys("9922510365");	
	}
	
	public void wrong_pwd()
	{
		password.sendKeys("Iamback@");
		
	}
	public void get_phone_error_massage() {
		String phone_error = incorrect_phone_error.getText();
		System.out.println(phone_error);
		if(phone_error.contains("Incorrect phone number")) {
			System.out.println("test passes with incoorect phone or un");
		}
		else {
			System.out.println("incoorect error massage");
		}
	}
	public void get_pass_error_massage() {
		String pass_error = incorrect_password_error.getText();
		System.out.println(pass_error);
		if(pass_error.contains("password is incorrect")) {
			System.out.println("test passes with incoorect password");
		}
		else {
			System.out.println("incoorect error massage");
		}
	}
	//step 3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
