package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistration {
	public static WebDriver driver;
	
	@Given("^Launch the application$")
	public void launch_the_application() throws Throwable {
	   System.out.println("This is from Given");
	   System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("http://automationpractice.com/index.php");
	   Thread.sleep(5000);
	   
	}

	@When("^User enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
		System.out.println("This is from When");
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		System.out.println("This is from Then");
	}

}
