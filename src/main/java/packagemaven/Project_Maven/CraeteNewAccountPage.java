package packagemaven.Project_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CraeteNewAccountPage {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name='customerName']")
	WebElement customername;
	@FindBy(xpath = "//input[@id='ap_phone_number']")
	WebElement phoneno;
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='continue']")
	WebElement verifyphone;
	@FindBy(xpath = "//input[@name='code']")
	WebElement verifcode;
	
	
	public void name() {
		customername.sendKeys("Patrik Patel");
	}
	public void phone() {
		phoneno.sendKeys("80556681556");
	}
	public void password() {
		password.sendKeys("Patrik@345");
	}
	public void submit() {
		verifyphone.click();
	}
	public void verify_code() {
		if(verifcode.isDisplayed()) {
			System.out.println("user can able to register ");
		}
	}
	public CraeteNewAccountPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
