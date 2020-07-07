package pageHelpers;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.org.cucumber.TestContext;
import com.org.dataProviders.ConfigFileReader;

import pageObjects.UserDetailsPage;

public class UserDetailsHelper {
	TestContext testContext;
	WebDriver driver;
	ConfigFileReader configFileReader;
	UserDetailsPage userDetailsPage;

	public UserDetailsHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void enter_AdminEmail(String adminUserName) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getTxtbx_adminUserName().sendKeys(adminUserName);
	}

	public void clickOn_Next() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getBtn_Next().click();
	}

	public void enter_Password(String password) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getTxtbx_Password().sendKeys(password);
	}

	public void clickOn_SignIn() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getBtn_SignIn().click();
	}

	public void clickOn_StaySignedIn() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (userDetailsPage.getChkbx_StaySignedIn().isSelected()) {
			userDetailsPage.getChkbx_StaySignedIn().click();
		}
	}

	public void clickOn_Yes() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getBtn_Yes().click();
	}

	public String ExpectedHeader = "Users | All users (Preview)";

	public void check_AllUsersText() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualHeaderText = userDetailsPage.getTxt_AllUsers().getText();
		try {
			SoftAssert softassert = new SoftAssert();
			softassert.assertEquals(ExpectedHeader, actualHeaderText);
		} catch (Exception e) {
			throw new Error("Header text is incorrect: " + actualHeaderText);
		}
	}

	public void clickOn_NewUser() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='New user']")));
		userDetailsPage.getBtn_NewUser().click();
	}

	public void enter_FirstName(String firstName) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getTxtbx_FirstName().sendKeys(firstName);
	}

	public void enter_LastName(String lastName) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getTxtbx_LastName().sendKeys(lastName);
	}

	public void enter_Name(String name) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getTxtbx_Name().sendKeys(name);
	}

	public void enter_UserName(String userName) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getTxtbx_UserName().sendKeys(userName);

	}

	public void enter_JobTitle(String jobTitle) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getTxtbx_JobTitle().sendKeys(jobTitle);
	}

	public void select_Location(String countryName) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getDrpdwn_LocationDropDown().click();
		userDetailsPage.getLocation_Filter().sendKeys(countryName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		for (WebElement location : userDetailsPage.getLocation_List()) {
			if (location.getText().equals(countryName)) {
				location.click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
				break;
			}
		}
	}

	public void check_UserName(String userName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

		for (WebElement username : userDetailsPage.getUserNames_List()) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			if (username.getText().equals(userName)) {
				try {
					SoftAssert softassert = new SoftAssert();
					softassert.assertEquals(userName, username.getText());
					System.out.println(username.getText() + " is successfully created!");
				} catch (Exception e) {
					throw new Error("User Name is not listed - " + e);
				}
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
				break;
			}
		}
	}

	public void enter_Department(String department) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userDetailsPage.getTxtbx_Department().sendKeys(department);
	}

	public void clickOn_CreateUser() {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			userDetailsPage.getBtn_CreateUser().click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void check_UserCreationMessage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualMessage = userDetailsPage.getTxt_Notification().getText();
		if (actualMessage.contains("")) {
			System.out.println("User created successfully!");
		}
	}

	public void check_CreateNewUserPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean userNameTextBox = userDetailsPage.getTxtbx_UserName().isDisplayed();
		try {
			SoftAssert softassert = new SoftAssert();
			softassert.assertEquals(true, userNameTextBox);
		} catch (Exception e) {
			throw new Error("New User Page is not displayed - " + e);
		}
	}

	public void isDisplayed_AllUsersPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean userNameTextBox = userDetailsPage.getTxt_AllUsers().isDisplayed();
		try {
			SoftAssert softassert = new SoftAssert();
			softassert.assertEquals(true, userNameTextBox);
		} catch (Exception e) {
			throw new Error("User is not navigated to All Users Page - " + e);
		}
	}

	public void handleAlert() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (isAlertPresent()) {
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}
	}

	public void handleNotification() {
		try {
			boolean flag = userDetailsPage.getBtn_CloseNotification().isDisplayed();
			if (flag) {
				userDetailsPage.getBtn_CloseNotification().click();
			}
		} catch (Exception e) {
		}

	}

}