package stepDefinitions;

import com.org.cucumber.TestContext;

import io.cucumber.java.en.Given;
import pageHelpers.HomeHelper;

public class HomeSteps {
	TestContext testContext;
	HomeHelper homeHelper;

/*	public HomeSteps(WebDriver driver) {
		this.driver = driver;
	}*/
	public HomeSteps(TestContext context) {
		testContext = context;
		homeHelper = testContext.getPageHelperManager().getHomeHelper();
	}

	@Given("^Go to homepage$")
	public void Go_to_homepage() throws Throwable {
		homeHelper.navigateTo_AdminPage();
	}

	@Given("^User is on homepage$")
	public void User_is_on_homepage() throws Throwable {
		homeHelper.select_TripType("Round Trip");
	}
}