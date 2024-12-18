package packagemaven.Project_Maven;
//verify product can added to cart 
//add to cart assertion remains
import org.testng.annotations.Test;

public class Test9 extends Launch_Quit {
	@Test//(retryAnalyzer = packagemaven.Project_Maven.RetryLogic.class)
	public void Add_to_Wishlist_Add_to_Cart() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();

		LoginPage login = new LoginPage(driver);
		login.un();
		login.cnt();
		login.pwd();
		login.signin();

		home.searching();
		WishlistPage w1 = new WishlistPage(driver);
		w1.add_to_wishlist(driver);
		Thread.sleep(2000);
		home.popup_close();
		Thread.sleep(2000);
		ProductPage p1 = new ProductPage(driver);
		p1.add_to_cart();

	}
}
