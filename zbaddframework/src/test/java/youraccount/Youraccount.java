package youraccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Youraccount {
   WebDriver driver;
	public static void main(String[] args) {
		 
	}
		

@Given("user should be on amazon website1")
public void user_should_be_on_amazon_website1() {
	WebDriver driver;
	System.setProperty("webdriver.Chromedriver","chromedriver.exe");
	driver= new ChromeDriver();
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
	@When("user clicks on your account 1")
	public void user_clicks_on_your_account_1() {
	driver.findElement(By.xpath("//a[@href='https://www.amazon.ca/a/addresses?ref_=ya_d_c_addr']")).click();
	}

}



	

