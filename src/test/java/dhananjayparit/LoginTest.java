package dhananjayparit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import dhananjayparit.pages.LoginPage;

public class LoginTest extends BaseTest {
		
	
	@Test
	public void validLoginTest() {
		
		
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickLoginButton();
	}
	
	@Test
	public void invalidLoginTest() {
		
		lp.enterUsername("Admin123");
		lp.enterPassword("admin1231234");
		lp.clickLoginButton();
		lp.verifyErrorMessage();

	}

}
