package packagemaven.Project_Maven;


import org.testng.annotations.Test;

//registration
public class Test1 extends Launch_Quit {

	@Test(retryAnalyzer = packagemaven.Project_Maven.RetryLogic.class)
	public void create_new_user() throws InterruptedException {

		HomePage home = new HomePage(driver);
		home.accountandlist_hoverhover(driver);
		home.create_new_account();
		Thread.sleep(3000);
		
		CraeteNewAccountPage c1 = new CraeteNewAccountPage(driver);
		c1.name();
		c1.phone();
		c1.password();
		c1.submit();
		Thread.sleep(3000);
		c1.verify_code();
	
		

	}
}
