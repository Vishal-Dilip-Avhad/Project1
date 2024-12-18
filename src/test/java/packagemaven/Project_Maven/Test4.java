package packagemaven.Project_Maven;
//user can succesffuly edit their info
import org.testng.annotations.Test;
public class Test4 extends Launch_Quit{

	@Test//(retryAnalyzer = packagemaven.Project_Maven.RetryLogic.class)
	public void verifyuserinfoedit() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.signin_method();

		LoginPage login = new LoginPage(driver);
		login.un();
		login.cnt();
		login.pwd();
		login.signin();
		
		ProfilePage p1 = new ProfilePage(driver);
		p1.user_profile(driver);
		p1.user_account();
		Thread.sleep(2000);
		p1.user_info();
		Thread.sleep(3000);
		p1.edit_name();
		
		p1.user_name();
		p1.user_update();
		
		
		
	}
}
