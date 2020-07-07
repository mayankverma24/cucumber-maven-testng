package stepDefinitions;

import com.org.cucumber.TestContext;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void setUp() {
		/*
		 * What all you can perform here Starting a webdriver Setting up DB connections
		 * Setting up test data Setting up browser cookies Navigating to certain page or
		 * anything before the test
		 */
	}

	@After
	public void tearDown() {
		testContext.getWebDriverManager().closeDriver();
	}

}