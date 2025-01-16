package dhananjayparit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResetPassword {
	
	public WebDriver driver;
	
	public ResetPassword(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (name="username")
	private WebElement username;
	
	//@FindBy (xpath="//button[text()=' Cancel ']")
	@FindBy (xpath="//div[@class=\"orangehrm-forgot-password-button-container\"]//descendant::button[1]")
	private WebElement cancelButton;
	
	@FindBy (xpath="//button[text()=' Reset Password ']")
	private WebElement resetPasswordButton;
	
	@FindBy (xpath="//span[text()='Required']")
	private WebElement requiredField;
	
	@FindBy (xpath="//h6[text()='Reset Password link sent successfully']")
	private WebElement successMessage;
	
	public void setUsername(String str) {
		username.clear();
		username.sendKeys(str);
	}
	
	public void clickCancelButton() {
		cancelButton.click();
	}
	
	public void clickRestPasswordButton() {
		resetPasswordButton.click();
	}
	
	public void verifyRequiredField() {
		Assert.assertEquals("Required", requiredField.getText());
	}
	
	public void verifySuccessMessage() {
		Assert.assertEquals("Reset Password link sent successfully", successMessage.getText());
	}
	
	

}
