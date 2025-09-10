package Scenarios.facebook;

import org.testng.annotations.Test;

import Scenarios.facebook.HomePage;
import Scenarios.facebook.LoginPage;
import Scenarios.facebook.ProductPage1;
import Scenarios.facebook.SearchResultPage;

public class TestCase3_LoginSearchWishListAndLogout extends BaseClass
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
		
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		searchResultPage.selectedProduct(driver);
		
		ProductPage1 pppage= new ProductPage1(driver);
		pppage.addToWishList();
		
		pppage.wishListBoxClose();
		
		
		homePage.accountAndListHoverOver(driver);
		homePage.signOutFromHP();
		}
		
}
