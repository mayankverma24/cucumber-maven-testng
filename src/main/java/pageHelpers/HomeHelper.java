package pageHelpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.org.dataProviders.ConfigFileReader;
import com.org.managers.PageObjectManager;

import pageObjects.HomePage;
import pageObjects.UserDetailsPage;

public class HomeHelper {
	WebDriver driver;
	ConfigFileReader configFileReader;
	PageObjectManager pageObjectManager;
	HomePage homePage;
	UserDetailsPage userDetailsPage;

	public HomeHelper(WebDriver driver) {
		this.driver = driver;
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		userDetailsPage = pageObjectManager.getUserDetailsPage();
	}

	public void navigateTo_AdminPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		configFileReader = new ConfigFileReader();
		String url = configFileReader.getApplicationUrl();
		driver.get(url);
	}

	public void select_TripType(String tripType) {
		if (tripType.equalsIgnoreCase("Round Trip")) {
			homePage.select_RoundTrip().click();
		} else {

		}
		userDetailsPage.getBtn_CloseNotification().click();
	}

}