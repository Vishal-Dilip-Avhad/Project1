package packagemaven.Project_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {

	WebDriver driver;
	@FindBy(xpath = "//input[@id='add-to-wishlist-button-submit']") WebElement addtowishlist_btn;
	@FindBy(id="huc-atwl-header-section") WebElement addedtowishlistmassage;
	@FindBy(id="huc-atwl-header-section") WebElement alreadyaddedtowishlistmassage;
	
	@FindBy(xpath="//span[@id='huc-view-your-list-button']") WebElement viewyourlist;
	
	@FindBy(xpath="//div[@id='itemMain_I2CVHODA2CYDCY']") WebElement unorderlist;
	@FindBy(xpath="//span[contains(text(), 'shopping')]") WebElement shoppinglist;
	@FindBy(xpath = "(//input[@name='submit.deleteItem'])[1]")
	WebElement removefromlist;
	@FindBy(xpath="//div[.='Deleted']") WebElement deletedbutton;
	
	
	public void add_to_wishlist(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		HomePage h1 = new HomePage(driver);
		h1.click_on_product(driver);
		
		ProductPage p1 = new ProductPage(driver);
		p1.child_window(driver);
		Thread.sleep(3000);
		
		addtowishlist_btn.click();
		Thread.sleep(4000);
//		viewyourlist.click();
//		Thread.sleep(2000);
			
	}
	public void isshoppinglistdisplayed() {
		boolean b1 = addedtowishlistmassage.isDisplayed();
		boolean b2 = alreadyaddedtowishlistmassage.isDisplayed();
		
		if(b1==true ||b2==true) {
			System.out.println("product added to wishlist");
		}
		else {
			System.out.println("product not added to wishlist");
		}
	}
	public void remove_from_wishlist() {
		removefromlist.click();
		if(deletedbutton.isDisplayed()) {
			System.out.println("items removed from wishlist");
		}
		
	}
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
