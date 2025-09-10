package Scenarios.facebook;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement acntList;
	public void accountAndListHoverOver(WebDriver driver) 
	{
		wait.until(ExpectedConditions.visibilityOf(acntList));

	Actions a1 = new Actions(driver);
	a1.moveToElement(acntList).perform();
	}
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signIn;
	public void signInFromHP() 
	{
		wait.until(ExpectedConditions.elementToBeClickable(signIn));
	signIn.click();
	}
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	public void searchProduct() 
	{
	wait.until(ExpectedConditions.visibilityOf(search));
	search.sendKeys("shoe"+ Keys.ENTER);
	}
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement signOut;
	public void signOutFromHP() {
		wait.until(ExpectedConditions.visibilityOf(signOut));
	signOut.click();
	}
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
}