package youraddress;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Youraddress {
WebDriver driver;
@Given("user is logged in")
public void user_is_logged_in() {
System.setProperty("webdriver.Chormedriver","chromedriver");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
driver.findElement(By.id("ap_email")).sendKeys("kinjalrajgor22@gmail.com");
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("ap_password")).sendKeys("kinjalrajgor23");
driver.findElement(By.id("signInSubmit")).click();
Actions b = new Actions(driver);

b.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

driver.findElement(By.xpath("//a[@href='/gp/css/homepage.html?ref_=nav_AccountFlyout_ya']")).click();
}
@When("user clicks on your account")
public void user_clicks_on_your_account() {
driver.findElement(By.xpath("//a[@href='https://www.amazon.ca/a/addresses?ref_=ya_d_c_addr']")).click();
}

@Then("user should be able to click on your address")
public void user_should_be_able_to_click_on_your_address() {
driver.findElement(By.id("ya-myab-address-add-link")).click();
}
@Given("you are on add new address page")
public void you_are_on_add_new_address_page() {
driver.navigate().refresh();
}
@When ("you select country")
public void you_select_country() {
	Select obj=new Select(driver.findElement(By.xpath("//span[@id='address-ui-widgets-countryCode']//span[@role='button']")));
	obj.selectByVisibleText("Canada");
}
@When ("you enter full name")
public void you_enter_full_name() {
	driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("kinjal rajgor");
}
@When("you enter your phone number")
public void you_enter_your_phone_number() {

driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("2265055221");

}
@When("you enter your address 1")
public void you_enter_your_address_1() {

driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("37 Radwinterdriver ");

}
@When("you enter your city")
public void you_enter_your_city() {

driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Etobicoke");

}
@When("you select your province")
public void you_select_your_province() {

WebElement provinceDropdown = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion"));

if (provinceDropdown.getTagName().equalsIgnoreCase("select")) {
Select dropdown = new Select(provinceDropdown);
dropdown.selectByVisibleText("Ontario");
} else {
System.out.println("Expected a <select> element, but found a " +
provinceDropdown.getTagName());
}
}
@When("you enter your postal code")
public void you_enter_your_postal_code() {

driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("M9V1P7");

}
@When("you click on add address")
public void you_click_on_add_address() {
driver.findElement(By.id("address-ui-widgets-form-submit-button")).click();
}
@Then("you should get an error saying fullname is mandatory")
public void you_should_get_an_error_saying_fullname_is_mandatory() {

String ErrorMessage = driver.findElement(By.id("address-ui-widgets-enterAddressFullName-full-validation-alerts")).getText();

Assert.assertEquals("Please enter a name.", ErrorMessage);
}
@Given("you are on add new address page1")
public void you_are_on_add_new_address_page1() {
you_are_on_add_new_address_page();
}
@When("you enter your fullname")
public void you_enter_your_fullname() {

driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("KINJAL RAJGOR");

}
@When("you enter your address1")
public void you_enter_your_address1() {
you_enter_your_address1();
}
@When("you enter your city1")
public void you_enter_your_city1() {
you_enter_your_city();
}
@When("you select your province1")
public void you_select_your_province1() {
you_select_your_province();
}
@When("you enter your postal code1")
public void you_enter_your_postal_code1() {
you_enter_your_postal_code();
}
@When("you click on add address1")
public void you_click_on_add_address1() {
you_click_on_add_address();
}
@Then("you should get an error saying phonenumber is mandatory")
public void you_should_get_an_error_saying_phonenumber_is_mandatory() {

String ErrorMessage = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber-full-validation-alerts")).getText();

Assert.assertEquals("Please enter a phone number so we can call if there areany issues with delivery.", ErrorMessage);
}
@Given("you are on add new address page2")
public void you_are_on_add_new_address_page2() {
you_are_on_add_new_address_page();
}

@When("you enter your fullname2")
public void you_enter_your_fullname2() {
you_enter_your_fullname();
}
@When("you enter your phonenumber2")
public void you_enter_your_phonenumber2() {
you_enter_your_phone_number();
}
@When("you enter your city2")
public void you_enter_your_city2() {
you_enter_your_city();
}
@When("you select your province2")
public void you_select_your_province2() {
you_select_your_province();
}
@When("you enter your postal code2")
public void you_enter_your_postal_code2() {
you_enter_your_postal_code();
}
@When("you click on add address2")
public void you_click_on_add_address2() {
you_click_on_add_address();
}
@Then("you should get an error saying address is mandatory")
public void you_should_get_an_error_saying_address_is_mandatory() {

String ErrorMessage = driver.findElement(By.id("address-ui-widgets-enterAddressLine2-full-validation-alerts")).getText();

Assert.assertEquals("Please enter an address.", ErrorMessage);
}
@Given("you are on add new address page3")
public void you_are_on_add_new_address_page3() {
you_are_on_add_new_address_page();
}
@When("you enter your fullname3")
public void you_enter_your_fullname3() {
you_enter_your_fullname();
}
@When("you enter your address3")
public void you_enter_your_address3() {
you_enter_your_address3();
}
@When("you enter your phonenumber3")
public void you_enter_your_phonenumber3() {

you_enter_your_phone_number();
}
@When("you select your province3")
public void you_select_your_province3() {
you_select_your_province();
}
@When("you enter your postal code3")
public void you_enter_your_postal_code3() {
you_enter_your_postal_code();
}
@When("you click on add address3")
public void you_click_on_add_address3() {
you_click_on_add_address();
}
@Then("you should get an error saying city is mandatory")
public void you_should_get_an_error_saying_city_is_mandatory() {

String ErrorMessage = driver.findElement(By.id("address-ui-widgets-enterAddressCity-full-validation-alerts")).getText();

Assert.assertEquals("Please enter a city name.", ErrorMessage);
}
@Given("you are on add new address page4")
public void you_are_on_add_new_address_page4() {
you_are_on_add_new_address_page();
}
@When("you enter your fullname4")
public void you_enter_your_fullname4() {
you_enter_your_fullname();
}
@When("you enter your address4")
public void you_enter_your_address4() {
you_enter_your_address4();
}
@When("you enter your city4")
public void you_enter_your_city4() {
you_enter_your_city();
}
@When("you enter your phonenumber4")
public void you_enter_your_phonenumber4() {
you_enter_your_phone_number();
}
@When("you enter your postal code4")
public void you_enter_your_postal_code4() {
you_enter_your_postal_code();
}

@When("you click on add address4")
public void you_click_on_add_address4() {
you_click_on_add_address();
}
@Then("you should get an error saying selecting a province is mandatory")
public void you_should_get_an_error_saying_selecting_a_province_is_mandatory() {

String ErrorMessage = driver.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId-full-validation-alerts")).getText();

Assert.assertEquals("Please enter a province/territory.", ErrorMessage);
}
@Given("you are on add new address page5")
public void you_are_on_add_new_address_page5() {
you_are_on_add_new_address_page();
}
@When("you enter your fullname5")
public void you_enter_your_fullname5() {
you_enter_your_fullname();
}
@When("you enter your address5")
public void you_enter_your_address5() {
you_enter_your_address5();
}
@When("you enter your city5")
public void you_enter_your_city5() {
you_enter_your_city();
}
@When("you select your province5")
public void you_select_your_province5() {
you_select_your_province();
}
@When("you enter your phonenumber5")
public void you_enter_your_phonenumber5() {
you_enter_your_phone_number();
}
@When("you click on add address5")
public void you_click_on_add_address5() {
you_click_on_add_address();
}
@Then("you should get an error saying postalcode is mandatory")
public void you_should_get_an_error_saying_postalcode_is_mandatory() {

String ErrorMessage = driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode-full-validation-alerts")).getText();

Assert.assertEquals("Please enter a postal code.", ErrorMessage);
}

@Given("you are on add new address page6")
public void you_are_on_add_new_address_page6() {
you_are_on_add_new_address_page();
}
@When("you enter your fullname6")
public void you_enter_your_fullname6() {
you_enter_your_fullname();
}
@When("you enter your phonenumber6")
public void you_enter_your_phonenumber6() {
you_enter_your_phone_number();
}
@When("you enter your address6")
public void you_enter_your_address6() {
you_enter_your_address6();
}
@When("you enter your city6")
public void you_enter_your_city6() {
you_enter_your_city();
}
@When("you select your province6")
public void you_select_your_province6() {
you_select_your_province();
}
@When("you enter your postal code6")
public void you_enter_your_postal_code6() {
you_enter_your_postal_code();
}
@When("click on make it default")
public void click_on_make_it_default() {
driver.findElement(By.id("address-ui-widgets-use-as-my-default")).click();
}
@When("enter the preferences required")
public void enter_the_preferences_required() {
driver.findElement(By.className("a-expander-prompt")).click();
}
@When("you click on add address6")
public void you_click_on_add_address6() {
you_click_on_add_address();
}
@Then("your address should be saved and made as default")
public void your_address_should_be_saved_and_made_as_default() {
String SuccessMessage = driver.findElement(By.id("yaab-alert-box")).getText();

Assert.assertEquals("Address saved", SuccessMessage);
}}
