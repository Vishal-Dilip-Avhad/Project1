package packagemaven.Project_Maven;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class ProductPage {

	WebDriver driver;
	@FindBy(xpath = "//span[.='Get It by Tomorrow']")
	WebElement get_it_by_tomorrow;
	@FindBy(xpath = "//div[@data-cy='delivery-recipe']")
	List<WebElement> product_delivery_details;
	@FindBy(xpath = "(//div[@data-cy='delivery-recipe'])[1]")
	WebElement firstproduct;

	@FindBy(id = "twotabsearchtextbox")
	WebElement search_tf;
	@FindBy(xpath = "//a[@class='a-link-normal s-no-outline']")
	WebElement product;
	@FindBy(id = "productTitle")
	WebElement producttitle;
	@FindBy(xpath = "//div[@class='a-section a-spacing-none aok-align-center aok-relative']")
	WebElement productprice;
	@FindBy(xpath = "//span[@data-hook='rating-out-of-text']")
	WebElement productratings;
	@FindBy(id = "feature-bullets")
	WebElement productdiscription;
	@FindBy(xpath = "//span[@class='a-price']")
	List<WebElement> allprices;

	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	WebElement proceedtobuy;
	@FindBy(xpath = "//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']")
	WebElement addtocart;
	@FindBy(xpath = "//h1[normalize-space()='Added to cart']")
	WebElement addedtocart;

	@FindBy(xpath = "//a[contains(text(),'      Go to Cart')]")
	WebElement gotocart;
	@FindBy(xpath = "//div[@id='nav-cart-count-container']")
	WebElement cartcontainer;

	@FindBy(xpath = "(//a[@id='attach-close_sideSheet-link'])[1]")
	WebElement closeaddtocartwindow;
	@FindBy(xpath = "//input[@id='buy-now-button']")
	WebElement buynowbutton;

	public void child_window(WebDriver driver) {
		Set<String> id = driver.getWindowHandles();
		Iterator<String> i1 = id.iterator();
		String parent = i1.next();
		String child = i1.next();
		driver.switchTo().window(child);
	}

	public void parent_window(WebDriver driver) {
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> i1 = id.iterator();
		String parent = i1.next();
		String child = i1.next();
		driver.switchTo().window(parent);
		driver.navigate().refresh();
	}

	public void search_product() {
		search_tf.sendKeys("samsung galaxy s23" + Keys.ENTER);
	}

	public void get_it_by_tomorrow_method() {
		get_it_by_tomorrow.click();
	}

	public List<WebElement> product_delivery_details() {

		return product_delivery_details;
	}

	public void click_on_product(WebDriver driver) {
		product.click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> i1 = id.iterator();
		String parent = i1.next();
		String child = i1.next();
		driver.switchTo().window(child);
	}

	public String get_product_title() {

		String title = producttitle.getText();
		System.out.println("Product Title: " + title);
		return title; // to use for further operation
	}

	public String get_product_price() {
		String price = productprice.getText();
		System.out.println("Product Price: " + price);
		return price;
	}

	public boolean get_product_rating() {
		boolean isDisplayed = productratings.isDisplayed();

		if (isDisplayed) {
			String ratingText = productratings.getText();
			System.out.println("Product Rating: " + ratingText);
		} else {
			System.out.println("Product Rating is not displayed.");
		}

		return isDisplayed;
	}

	public boolean get_product_discription() {
		boolean isDisplayed = productdiscription.isDisplayed();

		if (isDisplayed) {
			String descriptionText = productdiscription.getText();
			System.out.println("Product Description: " + descriptionText);
		} else {
			System.out.println("Product Description is not displayed.");
		}

		return isDisplayed; // Return whether the description is displayed
	}

	public void product_delivery() throws InterruptedException {

		for (WebElement ele : product_delivery_details) {
			String txt = ele.getText();
			if (txt.toLowerCase().contains("tomorrow")) {
				System.out.println("Product contains 'tomorrow': ");
			} else {
				System.out.println("Product does not contain 'tomorrow': ");
			}

		}

	}

	public void verifypriceascendingorder() {

		for (WebElement prices : allprices) {

			System.out.println(prices);

		}
	}

	public void add_to_cart() {

		try {
			addtocart.click();
//			if(addedtocart.isDisplayed()) {
//				System.out.println("product added to cart successfully");
//			}
		} catch (InvalidElementStateException e) {
			System.out.println("Error: The product is unavailable or something went wrong");
		}

	}

	public void proceed_to_buy() {

		proceedtobuy.click();
	}

	public void go_to_cart() {

		gotocart.click();
	}

	public void cart_container() {

		cartcontainer.click();
	}

	public void closecartwindow() {
		closeaddtocartwindow.click();
	}

	public void buynow() {
		buynowbutton.click();
	}

	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
