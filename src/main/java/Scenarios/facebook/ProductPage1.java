package Scenarios.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage1 
{
		@FindBy(id ="add-to-wishlist-button-submit")
		private WebElement wishlistButton;
		public void addToWishList() {
		wishlistButton.click();
		}
		@FindBy(xpath = "//button[@class=' a-button-close a-declarative']")
		private WebElement closeButton;
		public void wishListBoxClose() {
		closeButton.click();
		}
		@FindBy(id="add-to-cart-button")
		private WebElement addToCartButton;
		public void addToCart() {
		addToCartButton.click();
		}
		public ProductPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

}
