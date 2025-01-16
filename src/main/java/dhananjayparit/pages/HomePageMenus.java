package dhananjayparit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dhananjayparit.utils.CommanMethods;

public class HomePageMenus extends CommanMethods {
	
	WebDriver driver;
	
	public HomePageMenus(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@placeholder='Search']")
	private WebElement searchBox;
	
	@FindBy (xpath="//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy (xpath="//span[text()='PIM']")
	private WebElement PIM;
	
	@FindBy (xpath="//span[text()='Leave']")
	private WebElement leave;
	
	@FindBy (xpath="//span[text()='Time']")
	private WebElement time;
	
	@FindBy (xpath="//span[text()='Recruitment']")
	private WebElement recruitment;
	
	@FindBy (xpath="//span[text()='My Info']")
	private WebElement myInfo;
	
	@FindBy (xpath="//span[text()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy (xpath="//span[text()='Directory']")
	private WebElement directory;
	
	@FindBy (xpath="//span[text()='Performance']")
	private WebElement performance;
	
	@FindBy (xpath="//span[text()='Claim']")
	private WebElement claim;
	
	@FindBy (xpath="//span[text()='Buzz']")
	private WebElement buzz;
	
	@FindBy (xpath="//span[text()='Maintenance']")
	private WebElement maintenance;
	
	public void searchMenu(String menuName) {
		searchBox.clear();
		searchBox.sendKeys(menuName);
	}
	
	public void selectAdmin(){
		admin.click();
	}
	
	public void selectPIM(){
		PIM.click();
	}
	
	public void selectLeave(){
		leave.click();
	}
	
	public void selectTime(){
		time.click();
	}
	
	public void selectRecruitment(){
		recruitment.click();
	}
	
	public void selectMyInfo(){
		myInfo.click();
	}
	
	public void selectDashboard(){
		dashboard.click();
	}
	
	public void selectDirectory(){
		directory.click();
	}
	
	public void selectPerformance(){
		performance.click();
	}
	
	public void selectClaim(){
		claim.click();
	}
	
	public void selectBuzz(){
		buzz.click();
	}
	
	public void selectMaintenance(){
		maintenance.click();
	}
	

}
