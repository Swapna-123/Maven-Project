package Scenarios.facebook;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage 
{
		@FindBy(xpath ="(//a[@class='a-link-normal s-no-outline'])[1]")
		private WebElement chooseProd;
		public void selectedProduct(WebDriver driver) throws InterruptedException {
		chooseProd.click(); //out of many products selecting 1st
		Set<String> ids= driver.getWindowHandles();
		// System.out.println(driver.getCurrentUrl());
		Iterator<String> it = ids.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		Thread.sleep(3000);
		// System.out.println(driver.getCurrentUrl());
		}
		public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		
}
