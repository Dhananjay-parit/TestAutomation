package dhananjayparit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dhananjayparit.utils.CommanMethods;

public class LoginPage extends CommanMethods {

		public WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}

	    @FindBy (name="username")
	    private WebElement username;
	    
	    @FindBy (name="password")
	    private WebElement password;
	    
	    @FindBy (xpath="//button[text()=' Login ']")
	    private WebElement loginButton;
	    
	    @FindBy (xpath="//p[text()='Forgot Your Password? ']")
	    private WebElement forgotPasswordLink;
	    
	    @FindBy (xpath="//p[text()='Invalid credentials']")
	    private WebElement errorMessage;
	    
	    public void enterUsername(String name) {
	    	username.clear();
	    	username.sendKeys(name);
	    }
	    
	    public void enterPassword(String pwd) {
	    	password.clear();
	    	password.sendKeys(pwd);
	    }
	    
	    public void clickLoginButton() {
	    	loginButton.click();
	    }
	    
	    public void clickForgotPasswordLink() {
	    	forgotPasswordLink.click();
	    }
	    
	    public void verifyErrorMessage() {
	    	Assert.assertEquals("Invalid credentials", errorMessage.getText());
	    	
	    }

}
