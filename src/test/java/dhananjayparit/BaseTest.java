package dhananjayparit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import dhananjayparit.pages.HomePageMenus;
import dhananjayparit.pages.LoginPage;
import dhananjayparit.pages.ResetPassword;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public LoginPage lp;
	public ResetPassword resetpwd;
	public HomePageMenus hpmenus;
	
	@BeforeClass
	public void launchApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp = new LoginPage(driver);
		resetpwd = new ResetPassword(driver);
		hpmenus = new HomePageMenus(driver);
		
	}
	
	@AfterClass
	public void closeApplication() {
		driver.quit();
	}

}
