package amazonproductsearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonProductSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\anujg\\eclipse-workspace\\zbaddframework\\geckodriver.exe" );
			
		WebDriver driver=new ChromeDriver();
				POMAmzonProductSearch POM = new POMAmzonProductSearch(driver);
				driver.get("https://www.amazon.ca/");
				POM.typesearchtext("tshirt for women");
				POM.clicksearchbutton(); //Searching
				POM.selectSortByFilter("relevanceblender"); //Sort
				POM.selectSortByFilter("price-asc-rank"); //Sort
				POM.selectSortByFilter("price-desc-rank"); //Sort
				POM.selectSortByFilter("review-rank"); //Sort
				POM.selectSortByFilter("date-desc-rank"); //Sort
				POM.selectSortByFilter("exact-aware-popularity-rank"); //Sort
				POM.clickOnPage2(); //Pagination
				POM.clickOnNextButton(); //Pagination
				POM.selectBrand("Under Armour"); //Filtering

	}

}
