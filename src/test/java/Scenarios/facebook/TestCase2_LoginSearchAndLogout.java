package Scenarios.facebook;

import org.testng.annotations.Test;

import Scenarios.facebook.HomePage;
import Scenarios.facebook.LoginPage;

public class TestCase2_LoginSearchAndLogout extends BaseClass 
{

		@Test
		public void withValidCredentials() throws InterruptedException 
		{
		HomePage homePage = new HomePage(driver);
		homePage.accountAndListHoverOver(driver);
		homePage.signInFromHP();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.typeEmail();
		loginPage.typePassWord();
		loginPage.clickSignInButton();
		
		homePage.searchProduct();
		
		homePage.accountAndListHoverOver(driver);
		homePage.signOutFromHP();
		}
		
}
