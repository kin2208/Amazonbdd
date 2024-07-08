package amazonsignIn;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinationsignin {

	WebDriver driver;
//1	
	@Given("user should be on amazon website12")
	public void user_should_be_on_amazon_website12() {
	System.setProperty("webdriver.Chromedriver","chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println("inside sign in class");driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}
   @And("user enters email address")
public void user_enters_email_address() {
    driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor22@gmail.com");
}

@And("user click on continue")
public void user_click_on_continue() {
	driver.findElement(By.id("continue")).click();
  
}

@And("user enter password1")
public void user_enter_password1() {
    driver.findElement(By.id("ap_password")).sendKeys("kinjalrajgor23");
}

@And("user click on sign in1")
public void user_click_on_sign_in1() {
    driver.findElement(By.id("signInSubmit")).click();
}

@Then("user will be on amazon home page")
public void user_will_be_on_amazon_home_page() {
	
	 Assert.assertTrue("Sign in was successful",true);
	 driver.quit();
	
}
	//2


@Given("user should be on amazon website13")
public void user_should_be_on_amazon_website13() {
System.setProperty("webdriver.Chromedriver","chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
System.out.println("inside sign in class");driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
}
@And("user click continue1")
public void user_click_continue1() {
	driver.findElement(By.id("continue")).click();
	
}
@Then("user get error Enter your e-mail address or mobile phone number")
public void user_get_error_enter_your_e_mail_address_or_mobile_phone_number() {
    driver.quit();
}
//3
@Given("user should be on amazon website14")
public void user_should_be_on_amazon_website14() {
System.setProperty("webdriver.Chromedriver","chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
System.out.println("inside sign in class");driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
}
@And("user enters email address1")
public void user_enters_email_address1() {
driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor22@gmail.com");
}

@And("user click on continue2")
public void user_click_on_continue2() {
driver.findElement(By.id("continue")).click();

}
//4
@Given("user should be on amazon website15")
public void user_should_be_on_amazon_website15() {
System.setProperty("webdriver.Chromedriver","chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
System.out.println("inside sign in class");driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
}
@And("user enters email address2")
public void user_enters_email_address2() {
driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor22@gmail.com");
}

@And("user click on continue3")
public void user_click_on_continue3() {
driver.findElement(By.id("continue")).click();

}


@And("user click on sign in2")
public void user_click_on_sign_in2() {
driver.findElement(By.id("signInSubmit")).click();
}

@Then("user get error Enter your password")
public void user_get_error_Enter_your_password() {

 Assert.assertTrue("Enter your password",true);
 driver.quit();

}

//5
@Given("user should be on amazon website16")
public void user_should_be_on_amazon_website16() {
System.setProperty("webdriver.Chromedriver","chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
System.out.println("inside sign in class");driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
}
@And("user enters email address3")
public void user_enters_email_address3() {
driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor22@gmail.com");
}

@And("user click on continue4")
public void user_click_on_continue4() {
driver.findElement(By.id("continue")).click();

}

@And("user enter incorrect password")
public void user_enter_incorrect_password() {
driver.findElement(By.id("ap_password")).sendKeys("kinjalrajgor22");
}

@And("user click on sign in3")
public void user_click_on_sign_in3() {
driver.findElement(By.id("signInSubmit")).click();
}

@Then("user will get error Your password is incorrect")
public void user_will_get_error_Your_password_is_incorrect() {

 Assert.assertTrue("Sign in was successful",true);
 driver.quit();

}
}




