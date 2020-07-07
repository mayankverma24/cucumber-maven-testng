package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id='RoundTrip']")
	private WebElement rbtn_RoundTrip;

	@FindBy(how = How.XPATH, using = "//input[@value='Next']")
	WebElement btn_Next;


	@FindBy(how = How.XPATH, using = "(//span[@class='fxc-group-dropdown-arrow fxc-dropdown-open'])[2]")
	WebElement drpdwn_LocationDropDown;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Filter usage locations']")
	WebElement location_filter;

	@FindAll(@FindBy(how = How.XPATH, using = "//div[@role='treeitem']"))
	List<WebElement> location_List;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'azc-input azc-formControl azc-validation-border msportalfx-tooltip-overflow')])[6]")
	WebElement txtbx_JobTitle;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'azc-input azc-formControl azc-validation-border msportalfx-tooltip-overflow')])[7]")
	WebElement txtbx_Department;

	@FindBy(how = How.XPATH, using = "//div[@title='Create']")
	WebElement btn_CreateUser;

	@FindBy(how = How.XPATH, using = "//div[@class='fxs-toast-description fxs-portal-title']")
	WebElement txt_Notification;

	@FindBy(how = How.XPATH, using = "//button[@class='fxs-toast-close fxs-portal-svg']")
	WebElement btn_CloseNotification;

	@FindAll(@FindBy(how = How.XPATH, using = "//td[@aria-describedby='fxgridcol2']"))
	List<WebElement> txt_UserNames;

	public WebElement select_RoundTrip() {
		return rbtn_RoundTrip;
	}
}
