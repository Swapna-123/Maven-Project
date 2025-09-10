package Scenarios.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Scenarios.facebook.HomePage;
import Scenarios.facebook.LoginPage;


public class TestCase1_LoginAndLogout extends BaseClass 
{
@Test
public void withValidCredentials() 
{
	HomePage homePage = new HomePage(driver);
	homePage.accountAndListHoverOver(driver);
	Reporter.log("Hoverover on Sigin in homepage-SO that login can be done");
	homePage.signInFromHP();

	LoginPage loginPage = new LoginPage(driver);
	loginPage.typeEmail();
	Reporter.log("Email id accepeted");
	loginPage.typePassWord();
	Reporter.log("Password is accepeted");
	loginPage.clickSignInButton();
	Reporter.log("Click on sigin button is done");
	
	homePage.accountAndListHoverOver(driver);
	homePage.signOutFromHP();
	
	
}
}
