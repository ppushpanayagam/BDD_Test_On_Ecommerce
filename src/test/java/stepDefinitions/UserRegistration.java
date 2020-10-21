package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.HomePage;
import wrappers.EventsWrapper;

public class UserRegistration {
	public static WebDriver driver;
	HomePage homePage = new HomePage();
	AuthenticationPage authenticationPage = new AuthenticationPage();
	CreateAccountPage createAccountPage = new CreateAccountPage();
	
	@Given("^Launch the application$")
	public void launch_the_application() throws Throwable {
		homePage.verifyTitle("My Store");
		homePage.clickSignInButton();
	    Thread.sleep(5000);
	}

	@When("^User enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
		authenticationPage.enterEmailId("ppushpanayagam@hotmail.com");
		authenticationPage.clickCreateAccountBtn();
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		createAccountPage.clickTitleRadioBtn();
		createAccountPage.enterFirstName("firstName");
		createAccountPage.enterLastName("lastName");
		createAccountPage.enterPassword("password");
		createAccountPage.enterDateOfBirth("22", "January ", "1988");
		createAccountPage.enterFirstNameForAddress("firstNameadd");
		createAccountPage.enterLastNameForAddress("lastNameadd");
		createAccountPage.enterAddress("address");
		createAccountPage.enterCity("London");
		createAccountPage.selectState("Alabama");
		createAccountPage.enterPostCode("67789");
		createAccountPage.selectCountry("United States");
		createAccountPage.enterMobileNumber("567890678");
		createAccountPage.enterAddressAlias("alias address");
		createAccountPage.clickRegisterPageBtn();

	}

}
