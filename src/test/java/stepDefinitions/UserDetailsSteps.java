package stepDefinitions;

import java.util.List;
import java.util.Map;

import com.org.cucumber.TestContext;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageHelpers.UserDetailsHelper;

public class UserDetailsSteps {
	TestContext testContext;
	UserDetailsHelper userDetailsHelper;

	public UserDetailsSteps(TestContext context) {
		testContext = context;
		userDetailsHelper = testContext.getPageHelperManager().getUserDetailsHelper();
	}

	@Given("^User is logged in with (.+) and (.+)$")
	public void Admin_User_is_logged_in(String adminUserName, String password) throws Throwable {
	
	}

	@When("^User create following users from All Users page$")
	public void User_create_following_users_from_All_Users_page(DataTable dt) throws Throwable {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for (int i = 0; i < list.size(); i++) {
			userDetailsHelper.handleNotification();
			userDetailsHelper.clickOn_NewUser();
			userDetailsHelper.enter_UserName(list.get(i).get("userName"));
			userDetailsHelper.enter_Name(list.get(i).get("name"));
			userDetailsHelper.enter_FirstName(list.get(i).get("firstName"));
			userDetailsHelper.enter_LastName(list.get(i).get("lastName"));
			userDetailsHelper.enter_Department(list.get(i).get("department"));
			userDetailsHelper.handleNotification();
		}
	}

	@Then("^User is navigated to All Users page$")
	public void User_is_navigated_to_All_Users_page() throws Throwable {

	}

	@And("^Following User Names are displayed on the page$")
	public void Following_User_Names_are_displayed_on_the_page(DataTable dt) throws Throwable {
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for (int i = 0; i < list.size(); i++) {
		}
	}

}