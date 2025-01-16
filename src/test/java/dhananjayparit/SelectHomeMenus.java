package dhananjayparit;

import org.testng.annotations.Test;

public class SelectHomeMenus extends BaseTest {
  @Test
  public void ClickOnEachMenu() {
	  lp.enterUsername("Admin");
	  lp.enterPassword("admin123");
	  lp.clickLoginButton();
	  hpmenus.selectAdmin();
	  hpmenus.selectPIM();
	  hpmenus.selectLeave();
	  hpmenus.selectTime();
	  hpmenus.selectRecruitment();
	  hpmenus.selectMyInfo();
	  hpmenus.selectPerformance();
	  hpmenus.selectDashboard();
	  hpmenus.selectDirectory();
	  hpmenus.selectClaim();
	  hpmenus.selectBuzz();
  }
}
