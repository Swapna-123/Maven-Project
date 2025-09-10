package Scenarios.facebook;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "ap_email_login")
	private WebElement email;

	public void typeEmail() {
		email.sendKeys("9986416462" + Keys.ENTER);
	}

	@FindBy(id = "ap_password")
	private WebElement pwd;

	public void typePassWord() {
		pwd.sendKeys("9raCHUha");
	}

	@FindBy(id = "auth-signin-button")
	private WebElement signInButton;

	public void clickSignInButton() {
		signInButton.click();
	}

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
