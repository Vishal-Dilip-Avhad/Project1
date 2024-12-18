package packagemaven.Project_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	 WebDriver driver;
		
		//@FindBy(xpath="(//div[@data-a-input-name='ppw-instrumentRowSelection'])[1]") WebElement bajajfinserveradiobutton;
		@FindBy(xpath="//input[@value='SelectableAddCreditCard']") WebElement creditordebitcardbutton;
		
		@FindBy(xpath="//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']") WebElement netbankingbutton;
		@FindBy(xpath = "//input[@value='instrumentId=amzn1.pm.poa.YW16bjEucG9hOmFtem4xLnBvYS5wb2RhLlVuaWZpZWRQYXltZW50c0ludGVyZmFjZTox.QTFJVFVXMzczVDk3RDA&isExpired=false&paymentMethod=UnifiedPaymentsInterface&tfxEligible=false']") WebElement otherupiappbutton;
		
		@FindBy(xpath="//input[@value='instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false']") WebElement emibutton;
		@FindBy(xpath="//input[@value='instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false']") WebElement cashondeliverybutton;
		
		 
		
		@FindBy(xpath="//input[@id='pp-L9h3OV-106']") WebElement entercodefield;
		@FindBy(xpath="//a[normalize-space()='Change']") WebElement changeaddress;
		@FindBy(xpath="//input[@data-testid='Address_selectShipToThisAddress']") WebElement usethisaddress;
		
		
		@FindBy(xpath="//h3[@class='a-color-state']") WebElement selectpaymentmethodtxt;
		@FindBy(xpath="//h4[@class='a-color-error']") WebElement errortxt;
		@FindBy(xpath="//span[@class='a-button a-button-primary primary-action-button']") WebElement savequantities;
		
		
		
		

		
//		public boolean select_bajaj_finserve() throws InterruptedException
//		{
//			//bajajfinserveradiobutton.click();
//			Thread.sleep(2000);
//			return bajajfinserveradiobutton.isSelected();
//			
//		}
		public boolean select_creditcard() throws InterruptedException
		{
			creditordebitcardbutton.click();
			Thread.sleep(1000);
			return creditordebitcardbutton.isSelected();
				
		}
		public boolean select_netbanking() throws InterruptedException
		{
			netbankingbutton.click();
			Thread.sleep(1000);
			return netbankingbutton.isSelected();
		
		}
		public boolean select_otherupi()
		{
			otherupiappbutton.click();
			return otherupiappbutton.isSelected();
			
		}
		public boolean select_emi()
		{
			emibutton.click();
			return emibutton.isSelected();
				
		}
		public boolean select_cashondelivery()
		{
			cashondeliverybutton.click();
			return cashondeliverybutton.isSelected();
			
		}
		public void remove_quantity_error() {
			if(errortxt.isDisplayed()) {
				savequantities.click();
			}
			else {
				selectpaymentmethodtxt.getText();
			}
		}
		public void use_this_adresss() {
			if(usethisaddress.isDisplayed()) {
				usethisaddress.click();
			}
			else {
				System.out.println("adress isuue");
			}
		}
		public PaymentPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
}

