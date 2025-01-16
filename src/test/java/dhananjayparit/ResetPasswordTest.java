package dhananjayparit;

import org.testng.annotations.Test;

public class ResetPasswordTest extends BaseTest {
	
	
  @Test
  public void averifyRequiredMessage(){
	  lp.clickForgotPasswordLink();
	  resetpwd.clickRestPasswordButton();
	  resetpwd.verifyRequiredField();
  }
  
  @Test
  public void bverifyCancelButton() {
	  //lp.clickForgotPasswordLink();
      resetpwd.clickCancelButton();
  }
  
  @Test
  public void resetPassword() {
	  lp.clickForgotPasswordLink();
	  resetpwd.setUsername("NewUser");
	  resetpwd.clickRestPasswordButton();
	  
  }
}
