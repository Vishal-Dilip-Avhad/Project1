package packagemaven.Project_Maven;
//ensure login failed with incoorect email and password
import org.testng.annotations.Test;

public class Test3 extends Launch_Quit {

	@Test(retryAnalyzer = packagemaven.Project_Maven.RetryLogic.class)
	public void checkLoginFail()  {
		HomePage home= new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();
		
		LoginPage login = new LoginPage(driver);
		login.wrong_un();
		login.cnt();
		login.get_phone_error_massage();
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		login.un();
		login.cnt();
		login.wrong_pwd();
		login.signin();
		login.get_pass_error_massage();
		
		
	}
}
