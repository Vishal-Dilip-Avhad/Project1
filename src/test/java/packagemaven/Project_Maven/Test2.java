package packagemaven.Project_Maven;
//verify login with correct email and password
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends Launch_Quit {

	@Test(retryAnalyzer = packagemaven.Project_Maven.RetryLogic.class)
	public void login_to_amazon() throws InterruptedException {

		HomePage home = new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		LoginPage login = new LoginPage(driver);
		login.un();
		login.cnt();
		login.pwd();
		login.signin();
		Thread.sleep(2000);
		String txt = home.user_profile();
		Assert.assertEquals(true, txt.contains("Hello, Vishal"));
		

	}

}
