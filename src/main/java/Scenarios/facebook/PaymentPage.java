package Scenarios.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage 
{
		@FindBy(id="nav-cart")
		private WebElement cartLogo;
		public void backToCart()
		{
		cartLogo.click();
		}
		public PaymentPage(WebDriver driver) 
		{
		PageFactory.initElements(driver, this);
		}
	
}
