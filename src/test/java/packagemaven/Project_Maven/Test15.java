package packagemaven.Project_Maven;

import org.testng.annotations.Test;

//add to cart without login
public class Test15 extends Launch_Quit{

	@Test(retryAnalyzer = packagemaven.Project_Maven.RetryLogic.class)
	public void add_to_cart_without_login() {
		
		HomePage h1 = new HomePage(driver);
		h1.searching();
		h1.click_on_product(driver);
		
		ProductPage p1 = new ProductPage(driver);
		p1.child_window(driver);
		p1.add_to_cart();
		p1.parent_window(driver);
		p1.cart_container();
	}
}
