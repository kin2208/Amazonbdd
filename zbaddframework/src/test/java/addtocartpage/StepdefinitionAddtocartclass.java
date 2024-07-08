package addtocartpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefinitionAddtocartclass {
		
	WebDriver driver;
	//1

		@Given("user is on amazon website13")
		public void user_is_on_amazon_website() {
			System.setProperty("webdriver.Chromedriver","chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.ca/");System.out.println("inside sign in class");driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor22@gmail.com");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("kinjalrajgor23");
			driver.findElement(By.id("signInSubmit")).click();
			driver.findElement(By.id("twotabsearchtextbox")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone14");
			driver.findElement(By.id("twotabsearchtextbox")).submit();
			driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
			
		    
		}
//2
		@Given("user is on amazon website14")
		public void user_is_on_amazon_website14() {
			System.setProperty("webdriver.Chromedriver","chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.ca/");System.out.println("inside sign in class");driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor22@gmail.com");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("kinjalrajgor23");
			driver.findElement(By.id("signInSubmit")).click();
			driver.findElement(By.id("twotabsearchtextbox")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone14");
			driver.findElement(By.id("twotabsearchtextbox")).submit();
			driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
			driver.findElement(By.xpath("//a[@aria-label='2']")).isSelected();

		

}

		//3
		@Given("user is on amazon website15")
		public void user_is_on_amazon_website15() {
			System.setProperty("webdriver.Chromedriver","chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.ca/");System.out.println("inside sign in class");driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor22@gmail.com");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("kinjalrajgor23");
			driver.findElement(By.id("signInSubmit")).click();
			driver.findElement(By.id("twotabsearchtextbox")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone14");
			driver.findElement(By.id("twotabsearchtextbox")).submit();
			driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			driver.findElement(By.xpath("//a[@href='/cart?ref_=sw_gtc']")).click();
			driver.findElement(By.cssSelector("input[value='Delete'][name='submit.delete.ea8c200b-ee0d-46ed-aae9-322c560c5593']")).click();

}}