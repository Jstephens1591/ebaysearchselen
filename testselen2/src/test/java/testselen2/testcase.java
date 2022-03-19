package testselen2;




import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import driver.Base;

public class testcase {
	WebDriver driver = Base.initializer();
	homePage hp = new homePage(driver, driver);

	@Test
	public void goToSignInPage() throws InterruptedException {
		hp.clickSearchBtn().click();
		hp.enterSearchText().click();
		Assert.assertEquals(driver.getTitle(), "Security Measure");

	}

	@Test
	public void goToHomePage() {
		Assert.assertEquals(driver.getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
	}

	
}