package packagemaven.Project_Maven;

import org.testng.annotations.Test;

//verify that searching with filters(category, price range) yeilds accurate results
public class Test6 extends Launch_Quit{

	@Test(retryAnalyzer = packagemaven.Project_Maven.RetryLogic.class)
	public void verify_searching_with_filters_category_price_range() throws InterruptedException  {
		HomePage h1 = new HomePage(driver);
		h1.searching();
		
		
		
	}
}
