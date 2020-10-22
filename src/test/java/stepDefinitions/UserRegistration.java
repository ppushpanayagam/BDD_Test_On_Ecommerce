package stepDefinitions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.UserDashBoardPage;
import wrappers.EventsWrapper;

public class UserRegistration {

	HomePage homePage = new HomePage();
	AuthenticationPage authenticationPage = new AuthenticationPage();
	CreateAccountPage createAccountPage = new CreateAccountPage();
	UserDashBoardPage userDashBoardPage = new UserDashBoardPage();

	@Given("^Launch the application$")
	public void launch_the_application() throws Throwable {
		homePage.verifyTitle("My Store");
		homePage.clickSignInButton();
	}

	@When("^User enter email id$")
	public void user_enter_email_id() throws Throwable {
		Random random = new Random();
		int randomInt = random.nextInt(1000) + 1;
		authenticationPage.verifyTitleOfThePage("Login - My Store");
		authenticationPage.enterEmailId(randomInt+"email@mail.com");
		authenticationPage.clickCreateAccountBtn();
	}

	@And("^the user fill the registration form with valid values$")
	public void the_user_fill_the_registration_form_with_valid_values() throws Throwable {
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

	@Then("^User should be able to register a new account$")
	public void user_should_be_able_to_register_a_new_account() throws Throwable {
		Assert.assertEquals(true, userDashBoardPage.verifyLoggedUserDetails("firstName lastName"));
	}

}
