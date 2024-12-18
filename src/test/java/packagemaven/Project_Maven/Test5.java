package packagemaven.Project_Maven;
//Test searching for product
import org.testng.annotations.Test;

public class Test5 extends Launch_Quit {

	@Test(retryAnalyzer = packagemaven.Project_Maven.RetryLogic.class)
	public void login_to_amazon_search_a_product() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();

		LoginPage login = new LoginPage(driver);
		login.un();
		login.cnt();
		login.pwd();
		login.signin();

		home.searching();
		Thread.sleep(2000);

		String t1 = driver.getTitle();
		System.out.println(t1);
		if (t1.toLowerCase().contains("mobile")) {
			System.out.println("search result matched");
		} else {
			System.out.println("search result did not matched");
		}

	}
}
