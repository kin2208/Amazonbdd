package amazoncreateaccount;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinationclass {
	WebDriver driver;
	//1
	@Given("user should be on amazon website")
	public void user_should_be_on_amazon_website() {
	   System.setProperty("webdriver.Chromedriver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.ca/");
	}

	@When("user hover mouse on hello,sign in")
	public void user_hover_mouse_on_hello_sign_in() {
	   Actions action=new Actions (driver);
	   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	   driver.findElement(By.cssSelector(".nav-a[href='https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0']")).click();
	  
	}


	@When("user enter your name")
	public void user_enter_your_name() {
	    driver.findElement(By.id("ap_customer_name")).sendKeys("Kinjal");
	}

	@When("user enter email or mobile number")
	public void user_enter_email_or_mobile_number() {
	   driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor228@gmail.com");
	}

	@When("user enter password")
	public void user_enter_password() {
		driver.findElement(By.id("ap_password")).sendKeys("Kinjal228");
	}

	@When("user enter password again")
	public void user_enter_password_again() {
		driver.findElement(By.id("ap_password_check")).sendKeys("Kinjal228");
	}

	@When("user click on verify email")
	public void user_click_on_verify_email() {
	    driver.findElement(By.id("continue")).click();
	}

	

	@Then("user will able to amazon home page")
	public void user_will_able_to_amazon_home_page() {
		Assert.assertTrue("Sign in was successful",true);
		 driver.quit();
		
	}


//2
@Given("user should be on amazon website2")
public void user_should_be_on_amazon_website2() {
   System.setProperty("webdriver.Chromedriver","chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.ca/");
}

@When("user hover mouse on hello,sign in1")
public void user_hover_mouse_on_hello_sign_in1() {
   Actions action=new Actions (driver);
   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
   driver.findElement(By.cssSelector(".nav-a[href='https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0']")).click();
  
}
@When("user enter email or mobile number1")
public void user_enter_email_or_mobile_number1() {
   driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor228@gmail.com");
}

@When("user enter password3")
public void user_enter_password3() {
	driver.findElement(By.id("ap_password")).sendKeys("Kinjal228");
}

@When("user enter password again3")
public void user_enter_password_again3() {
	driver.findElement(By.id("ap_password_check")).sendKeys("Kinjal228");
}

@When("user click on verify email1")
public void user_click_on_verify_email1() {
    driver.findElement(By.id("continue")).click();
}



@Then("user will able to amazon home page1")
public void user_will_able_to_amazon_home_page1() {
	Assert.assertTrue("Sign in was successful",true);
	 driver.quit();
	 assertTrue("Enter your name", false);
	
}

private void assertTrue(String string, boolean b) {
	// TODO Auto-generated method stub
	
}
//3
@Given("user should be on amazon website3")
public void user_should_be_on_amazon_website3() {
   System.setProperty("webdriver.Chromedriver","chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.ca/");
}

@When("user hover mouse on hello,sign in2")
public void user_hover_mouse_on_hello_sign_in2() {
   Actions action=new Actions (driver);
   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
   driver.findElement(By.cssSelector(".nav-a[href='https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0']")).click();
  
}
@When("user enter your name1")
public void user_enter_your_name1() {
    driver.findElement(By.id("ap_customer_name")).sendKeys("Kinjal");
}
@When("user enter password4")
public void user_enter_password4() {
	driver.findElement(By.id("ap_password")).sendKeys("Kinjal228");
}

@When("user enter password again4")
public void user_enter_password_again4() {
	driver.findElement(By.id("ap_password_check")).sendKeys("Kinjal228");
}

@When("user click on verify email2")
public void user_click_on_verify_email2() {
    driver.findElement(By.id("continue")).click();
}



@Then("user will able to amazon home page2")
public void user_will_able_to_amazon_home_page2() {
	Assert.assertTrue("Sign in was successful",true);
	 driver.quit();
	 assertTrue("Please enter a valid mobile phone number with area code.", true);
	
}
//4
@Given("user should be on amazon website4")
public void user_should_be_on_amazon_website4() {
   System.setProperty("webdriver.Chromedriver","chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.ca/");
}

@When("user hover mouse on hello,sign in4")
public void user_hover_mouse_on_hello_sign_in4() {
   Actions action=new Actions (driver);
   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
   driver.findElement(By.cssSelector(".nav-a[href='https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0']")).click();
  
}


@When("user enter your name2")
public void user_enter_yourname2() {
    driver.findElement(By.id("ap_customer_name")).sendKeys("Kinjal");
}

@When("user partially enter phonenumber1")
public void user_partially_enter_phonenumber1() {
   driver.findElement(By.id("ap_email")).sendKeys("2265");
}

@When("user enter password5")
public void user_enter_password5() {
	driver.findElement(By.id("ap_password")).sendKeys("Kinjal228");
}

@When("user enter password again5")
public void user_enter_password_again5() {
	driver.findElement(By.id("ap_password_check")).sendKeys("Kinjal228");
}

@When("user click on verify phonenumber")
public void user_click_on_verify_phonenumber() {
    driver.findElement(By.id("continue")).click();
}

@Then("user will able to amazon home page3")
public void user_will_able_to_amazon_home_page3() {
	Assert.assertTrue("Wrong or invalid e-mail address or mobile phone number. Please correct it and try again.",true);
	 driver.quit();
	
}


//5
@Given("user should be on amazon website5")
public void user_should_be_on_amazon_website5() {
   System.setProperty("webdriver.Chromedriver","chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.ca/");
}

@When("user hover mouse on hello,sign in5")
public void user_hover_mouse_on_hello_sign_in5() {
   Actions action=new Actions (driver);
   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
   driver.findElement(By.cssSelector(".nav-a[href='https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0']")).click();
  
}


@When("user enter your name3")
public void user_enter_your_name3() {
    driver.findElement(By.id("ap_customer_name")).sendKeys("Kinjal");
}

@When("user partially enter email")
public void user_partially_enter_phonenumber() {
   driver.findElement(By.id("ap_email")).sendKeys("kinjalrajg");
}

@When("user enter password6")
public void user_enter_password6() {
	driver.findElement(By.id("ap_password")).sendKeys("Kinjal228");
}

@When("user enter passowrd again6")
public void user_enter_passowrd_again6() {
	driver.findElement(By.id("ap_password_check")).sendKeys("Kinjal228");
}

@When("user click on verify email3")
public void user_click_on_verify_email3() {
    driver.findElement(By.id("continue")).click();
}

@Then("user will able to amazon home page4")
public void user_will_able_to_amazon_home_page4() {
	Assert.assertTrue("Wrong or invalid e-mail address or mobile phone number. Please correct it and try again.",true);
	 driver.quit();
	
}


//6
@Given("user should be on amazon website6")
public void user_should_be_on_amazon_website6() {
   System.setProperty("webdriver.Chromedriver","chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.ca/");
}

@When("user hover mouse on hello,sign in6")
public void user_hover_mouse_on_hello_sign_in6() {
   Actions action=new Actions (driver);
   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
   driver.findElement(By.cssSelector(".nav-a[href='https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0']")).click();
  
}


@When("user enter your name4")
public void user_enter_your_name4() {
    driver.findElement(By.id("ap_customer_name")).sendKeys("Kinjal");
}

@When("user enter email or mobile number2")
public void user_enter_email_or_mobile_number2() {
   driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor228@gmail.com");
}

@When("user enter password with character5")
public void user_enter_password_with_character5() {
	driver.findElement(By.id("ap_password")).sendKeys("Kinja");
}

@When("user enter password again7")
public void user_enter_password_again7() {
	driver.findElement(By.id("ap_password_check")).sendKeys("Kinjal228");
}

@When("user click on verify email4")
public void user_click_on_verify_email4() {
    driver.findElement(By.id("continue")).click();
}



@Then("user will able to amazon home page5")
public void user_will_able_to_amazon_home_page5() {
	Assert.assertTrue("Sign in was successful",true);
	 driver.quit();
	
}
//7
@Given("user should be on amazon website7")
public void user_should_be_on_amazon_website7() {
   System.setProperty("webdriver.Chromedriver","chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.ca/");
}

@When("user hover mouse on hello,sign in7")
public void user_hover_mouse_on_hello_sign_in7() {
   Actions action=new Actions (driver);
   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
   driver.findElement(By.cssSelector(".nav-a[href='https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0']")).click();
  
}


@When("user enter your name5")
public void user_enter_your_name5() {
    driver.findElement(By.id("ap_customer_name")).sendKeys("Kinjal");
}

@When("user enter email or mobile number3")
public void user_enter_email_or_mobile_number3() {
   driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor228@gmail.com");
}



@When("user enter password again8")
public void user_enter_password_again8() {
	driver.findElement(By.id("ap_password_check")).sendKeys("Kinjal228");
}

@When("user click on verify email5")
public void user_click_on_verify_email5() {
    driver.findElement(By.id("continue")).click();
}

@Then("user will able to amazon home page6")
public void user_will_able_to_amazon_home_page6() {
	Assert.assertTrue("Sign in was successful",true);
	 driver.quit();
	
}
//8
@Given("user should be on amazon website8")
public void user_should_be_on_amazon_website8() {
   System.setProperty("webdriver.Chromedriver","chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.amazon.ca/");
}

@When("user hover mouse on hello,sign in8")
public void user_hover_mouse_on_hello_sign_in8() {
   Actions action=new Actions (driver);
   action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
   driver.findElement(By.cssSelector(".nav-a[href='https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0']")).click();
  
}


@When("user enter your name6")
public void user_enter_your_name6() {
    driver.findElement(By.id("ap_customer_name")).sendKeys("Kinjal");
}

@When("user enter email or mobile number4")
public void user_enter_email_or_mobile_number4() {
   driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor228@gmail.com");
}

@When("user enter password7")
public void user_enter_password7() {
	driver.findElement(By.id("ap_password")).sendKeys("Kinjal228");
}

@When("user enter different password")
public void user_enter_different_password() {
	driver.findElement(By.id("ap_password_check")).sendKeys("Kinjal229");
}

@When("user click on verify email6")
public void user_click_on_verify_email6() {
    driver.findElement(By.id("continue")).click();
}



@Then("user will able to amazon home page7")
public void user_will_able_to_amazon_home_page7() {
	Assert.assertTrue("Sign in was successful",true);
	 driver.quit();
}}

