package amazonproductsearch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMAmzonProductSearch {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox") WebElement SearchBox;
	@FindBy(id="nav-search-submit-button") WebElement SearchSubmitButton;

	@FindBy(id="s-result-sort-select") WebElement SortFilter;
	@FindBy(xpath="//a[contains(@aria-label,'Go to page 2')]") WebElement Page2Link;
	@FindBy(xpath="//a[contains(@aria-label, 'Next')]") WebElement NextButton;

	public POMAmzonProductSearch(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	public void typesearchtext(String searchtext) {
	SearchBox.sendKeys(searchtext);
	}
	public void clicksearchbutton() {
	SearchSubmitButton.click();
	}
	public void selectSortByFilter(String value) {
	Select SortByFilter = new Select(SortFilter);
	SortByFilter.selectByValue(value);
	}
	public void clickOnPage2() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", Page2Link);
	Page2Link.click();
	}
	public void clickOnNextButton() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", NextButton);
	NextButton.click();
	}
	public void selectBrand(String brandName) {

	WebElement brandCheckbox = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])"));
	//input[@type='checkbox']"));

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", brandCheckbox);
	brandCheckbox.click();
	}
}
