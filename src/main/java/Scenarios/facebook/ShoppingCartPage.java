package Scenarios.facebook;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage 
{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		@FindBy(name ="proceedToRetailCheckout")
		private WebElement proceedButton;
		public void proceed() {
			wait.until(ExpectedConditions.visibilityOf(proceedButton));
		proceedButton.click();
		}
		public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

		
}
