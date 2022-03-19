package testselen2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	protected WebDriver driver;
	
	By eBayLogo = By.id("gh-logo");
	By bellIcon = By.id("gh-Alerts-i");
	By cartIcon = By.id("gh-minicart-hover");
	By searchBtn = By.id("gh-btn");
	By searchTextBox = By.id("gh-ac");
	By signInLink = By.id("gh-eb-Alerts-o");
	By categoriesDropDown = By.id("gh-cat");
	
	public homePage(WebDriver driver2, WebDriver driver) {
		this.driver = driver;
	}
	public WebElement clickBellIcon() {
		return driver.findElement(bellIcon);
	}
	
	public WebElement clickEbayLogo() {
		return driver.findElement(eBayLogo);
	}
	
	public WebElement clickCartIcon() {
		return driver.findElement(cartIcon);
	}
	
	public WebElement clickSearchBtn() {
		return driver.findElement(searchBtn);
	}
	
	public WebElement clickCategories() {
		return driver.findElement(categoriesDropDown);
	}
	
	public WebElement clickSignInLink() {
		return driver.findElement(signInLink);
	}
	
	public WebElement enterSearchText() {
		return driver.findElement(searchTextBox);
	}
	public WebElement enterSearchText1() {
		return driver.findElement(searchTextBox);
	}
}