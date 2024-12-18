package packagemaven.Project_Maven;
//check user is able to select each payment method
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test12 extends Launch_Quit {

	@Test (retryAnalyzer = packagemaven.Project_Maven.RetryLogic.class)
	public void verify_payment_method() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();

		LoginPage login = new LoginPage(driver);
		login.un();
		login.cnt();
		login.pwd();
		login.signin();

		home.searching();
		home.click_on_new_product(driver);
		
		ProductPage p2 = new ProductPage(driver);
		p2.child_window(driver);
		p2.add_to_cart();
		Thread.sleep(3000);
		p2.closecartwindow();
		Thread.sleep(2000);
		p2.cart_container();
		Thread.sleep(2000);
		
		p2.proceed_to_buy();
		Thread.sleep(4000);
		
		PaymentPage p1 = new PaymentPage(driver);
		//p1.remove_quantity_error();
		p1.use_this_adresss();
		Thread.sleep(5000);
		
//		Assert.assertTrue(p1.select_bajaj_finserve());
//		Thread.sleep(2000);
		
		Assert.assertTrue(p1.select_creditcard());
		Thread.sleep(2000);
		Assert.assertTrue(p1.select_netbanking());
		Thread.sleep(2000);
		Assert.assertTrue(p1.select_otherupi());
		Thread.sleep(2000);
		Assert.assertTrue(p1.select_emi());
		Thread.sleep(2000);
		Assert.assertTrue(p1.select_cashondelivery());
		Thread.sleep(2000);
	}
}
