package amazonproductsearch;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazonsearchsteps {
	
	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("insidestep-browser is open");
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is :"+projectPath);
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();
		
		
	}

	@And("user is on amazon website")
	public void user_is_on_amazon_website() {
		System.out.println("insidestep-user is on amazon website");
		driver.navigate().to("https://www.amazon.ca/");
		throw new io.cucumber.java.PendingException();
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws Exception   {
		System.out.println("insidestep-user enters a text in search box");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I phone 14 pro max");
		Thread.sleep(2000);
		}

	@When("hits enter")
	public void hits_enter() throws InterruptedException  {
		System.out.println("insidestep-hits enter");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		System.out.println("insidestep-user is navigated to search result");
		driver.getPageSource().contains("I phone 14 pro max");
		driver.close();
		driver.quit();

	}


}
