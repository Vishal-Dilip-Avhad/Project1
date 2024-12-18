package packagemaven.Project_Maven;
//test updating item quantities and remove from cart
import org.testng.annotations.Test;

public class Test10 extends Launch_Quit{

   @Test(retryAnalyzer = packagemaven.Project_Maven.RetryLogic.class)
   public void check_update_quantities_remove_add_to_cart() throws InterruptedException {
	HomePage home = new HomePage(driver);
	home.accountandlist_hoverhover(driver);
	home.signin_method();

	LoginPage login = new LoginPage(driver);
	login.un();
	login.cnt();
	login.pwd();
	login.signin();

	home.searching();
	home.click_on_product(driver);
	Thread.sleep(2000);
	
	ProductPage p1 = new ProductPage(driver);
	p1.child_window(driver);
	p1.add_to_cart();
	Thread.sleep(3000);
	p1.closecartwindow();
	Thread.sleep(2000);
	p1.cart_container();
	Thread.sleep(3000);
	
	ShoppingCart s1 = new ShoppingCart(driver);
	s1.increment();
	Thread.sleep(4000);
	s1.quantities();
	Thread.sleep(2000);
	s1.remove_from_cart();
	Thread.sleep(2000);
	s1.cart_empty_massage();
	
   }
}
