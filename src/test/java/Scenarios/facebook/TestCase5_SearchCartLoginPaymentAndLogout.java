package Scenarios.facebook;

import org.testng.annotations.Test;

import Scenarios.facebook.HomePage;
import Scenarios.facebook.LoginPage;
import Scenarios.facebook.PaymentPage;
import Scenarios.facebook.ProductPage1;
import Scenarios.facebook.SearchResultPage;
import Scenarios.facebook.ShoppingCartPage;

public class TestCase5_SearchCartLoginPaymentAndLogout extends BaseClass
{
		@Test
		public void withValidCredentials() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.searchProduct();
		
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		searchResultPage.selectedProduct(driver);
		
		ProductPage1 pppage= new ProductPage1(driver);
		pppage.addToCart();
				
		homePage.accountAndListHoverOver(driver);
		homePage.signInFromHP();
		
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.typeEmail();
		loginPage.typePassWord();
		loginPage.clickSignInButton();
	
		
		ShoppingCartPage cartPage= new ShoppingCartPage(driver);
		cartPage.proceed();
		
		
		PaymentPage paymentPage = new PaymentPage(driver);
		paymentPage.backToCart();
		
		
		homePage.accountAndListHoverOver(driver);
		homePage.signOutFromHP();
		}
		
}
