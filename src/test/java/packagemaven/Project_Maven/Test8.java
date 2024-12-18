package packagemaven.Project_Maven;

//verify product can be sorted by relevence, price, ratings
//ascending order assertion remening
import org.testng.annotations.Test;
public class Test8 extends Launch_Quit{
	@Test(retryAnalyzer = packagemaven.Project_Maven.RetryLogic.class)
	public void check_delivery_status_filter() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();

		LoginPage login = new LoginPage(driver);
		login.un();
		login.cnt();
		login.pwd();
		login.signin();

		home.searching();
		
		ProductPage p1 = new ProductPage(driver);
		p1.get_it_by_tomorrow_method();
		Thread.sleep(3000);
		p1.product_delivery();
		
		home.sort_low_to_high();
		
		p1.verifypriceascendingorder();
		
	}
}
