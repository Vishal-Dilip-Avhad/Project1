package packagemaven.Project_Maven;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	// step 1
	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement user_accountandlist;
	
	@FindBy(xpath = "//a[contains(text(),'Start here.')]")
	WebElement createnewaccount;
	@FindBy(xpath = "(//span[.='Sign in'])[1]")
	WebElement signin;
	@FindBy(id = "twotabsearchtextbox")
	WebElement search_tf;
	@FindBy(xpath = "(//a[@class='a-link-normal s-no-outline'])[5]")
	WebElement product;
	@FindBy(xpath = "(//a[@class='a-link-normal s-no-outline'])[3]")
	WebElement newproduct;

	@FindBy(xpath = "//button[@data-action='a-popover-close']")
	WebElement closepopup;
	
	@FindBy(xpath = "//a[@id='attach-close_sideSheet-link']")
	WebElement closeaddtocartwindow;

	@FindBy(id = "nav-flyout-wl-items")
	WebElement viewshoppinglist;

	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement userprofile;

	@FindBy(xpath="//span[.='Featured']") WebElement sortby;
	@FindBy(xpath="//a[.='Price: Low to High']") WebElement sortbypricelowtohigh;
	@FindBy(xpath="//a[.='Newest Arrivals']") WebElement sortbynewarrival;
	@FindBy(xpath="(//input[@id='p_36/range-slider_slider-item_upper-bound-slider'])[2]") WebElement priceslider;
	
	
	public void create_new_account() {
		createnewaccount.click();
	}
	// step 2
	public void accountandlist_hoverhover(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();

	}
	public void user_accountlist_hoverover(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}

	public void signin_method() {
		signin.click();
	}

	public void searching() {
		search_tf.sendKeys("mobiles" + Keys.ENTER);
	}

	public void click_on_product(WebDriver driver) {

		product.click();	
	}
	public void click_on_new_product(WebDriver driver) {

		newproduct.click();	
	}

	public void popup_close() throws InterruptedException {
		closepopup.click();
		Thread.sleep(2000);
	}
    public void price_slider(WebDriver driver) {
	Actions a1 = new Actions(driver);
	a1.dragAndDropBy(priceslider, 80, 88).perform();
	
   }
	

	public void close_add_to_cart_window() throws InterruptedException {
		closeaddtocartwindow.click();
		Thread.sleep(2000);
	}

	public void shopping_list() throws InterruptedException {
		viewshoppinglist.click();
		Thread.sleep(2000);
	}

	

	public String user_profile() {
		String t1 = userprofile.getText();
		return t1;
	}
	public void sort_low_to_high() {
		sortby.click();
		sortbypricelowtohigh.click();
	}

	// step 3
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
