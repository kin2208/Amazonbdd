package yourorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Yourorder {
	WebDriver driver;
	@Given("user is login on the account1")
	public void user_is_login_on_the_account1() {
		
			System.setProperty("webdriver.Chormedriver","chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor22@gmail.com");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("kinjalrajgor23");
			driver.findElement(By.id("signInSubmit")).click();
			Actions action= new Actions(driver);

			action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

			driver.findElement(By.xpath("//a[@href='/gp/css/homepage.html?ref_=nav_AccountFlyout_ya']")).click();
			}
	    

	@When("user click on your account4")
	public void user_click_on_your_account4() {
		
			driver.findElement(By.xpath("(//div[@data-card-identifier='YourOrders']/div/div/div)[2]"));
			}
	    
	@When("user click on your order")
	public void user_click_on_your_order() {
		driver.findElement(By.xpath("//div[@data-card-identifier='YourOrders']//div[@class='a-box-inner']")).click();
	}

	@When("user click on buy again")
	public void user_click_on_buy_again() {
	    driver.findElement(By.xpath("//a[@class='a-link-normal'][normalize-space()='Buy Again']")).click();
	}

	@Then("user able to see past order")
	public void user_able_to_see_past_order() {
	    driver.quit();
	}
	@When("user click on your account5")
	public void user_click_on_your_account5() {
		driver.findElement(By.xpath("(//div[@data-card-identifier='YourOrders']/div/div/div)[2]"));
	   
	}

	@When("user click on your order1")
	public void user_click_on_your_order1() {
		driver.findElement(By.xpath("//div[@data-card-identifier='YourOrders']//div[@class='a-box-inner']")).click();
	}

	@When("user click on Notyet shipped")
	public void user_click_on_notyet_shipped() {
	    driver.findElement(By.cssSelector("section[class='your-orders-content-container aok-relative js-yo-container'] li:nth-child(3) a:nth-child(1)")).click();
	}

	@Then("user able to see past order1")
	public void user_able_to_see_past_order1() {
	   driver.quit();
	}
	@Given("user is login on the account2")
	public void user_is_login_on_the_account2() {
		
			System.setProperty("webdriver.Chormedriver","chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor22@gmail.com");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("kinjalrajgor23");
			driver.findElement(By.id("signInSubmit")).click();
			Actions action= new Actions(driver);

			action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

			driver.findElement(By.xpath("//a[@href='/gp/css/homepage.html?ref_=nav_AccountFlyout_ya']")).click();
			}
	    
	@When("user click on your account6")
	public void user_click_on_your_account6() {
		
		driver.findElement(By.xpath("(//div[@data-card-identifier='YourOrders']/div/div/div)[2]"));
	}

	@When("user click on your order2")
	public void user_click_on_your_order2() {
		driver.findElement(By.xpath("//div[@data-card-identifier='YourOrders']//div[@class='a-box-inner']")).click();
	    
	}

	@When("user click on cancelled order")
	public void user_click_on_cancelled_order() {
		driver.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(4) > a")).click();
	 
	}
	@Then("user able to see past order2")
	public void user_able_to_see_past_order2() {
	  driver.quit(); 
	}



}
