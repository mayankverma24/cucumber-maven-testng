package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsPage {
	WebDriver driver;

	public UserDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "i0116")
	WebElement txtbx_AdminUserName;

	@FindBy(how = How.XPATH, using = "//input[@value='Next']")
	WebElement btn_Next;

	@FindBy(how = How.ID, using = "i0118")
	WebElement txtbx_Password;

	@FindBy(how = How.XPATH, using = "//input[@value='Sign in']")
	WebElement btn_SignIn;

	@FindBy(how = How.ID, using = "KmsiCheckboxField")
	WebElement chkbx_StaySignedIn;

	@FindBy(how = How.XPATH, using = "//input[contains(@value,'Yes')]")
	WebElement btn_Yes;

	@FindBy(how = How.XPATH, using = "//h2")
	WebElement lbl_AllUsers;

	@FindBy(how = How.XPATH, using = "//li[@title='New user']")
	WebElement btn_NewUser;

	@FindBy(how = How.XPATH, using = "//input[@aria-label='User name']")
	WebElement txtbx_UserName;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'azc-input azc-formControl azc-validation-border msportalfx-tooltip-overflow')])[3]")
	WebElement txtbx_Name;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'azc-input azc-formControl azc-validation-border msportalfx-tooltip-overflow')])[4]")
	WebElement txtbx_FirstName;

	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'azc-input azc-formControl azc-validation-border msportalfx-tooltip-overflow')])[5]")
	WebElement txtbx_LastName;

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

	public WebElement getTxtbx_adminUserName() {
		return txtbx_AdminUserName;
	}

	public WebElement getBtn_Next() {
		return btn_Next;
	}

	public WebElement getTxtbx_Password() {
		return txtbx_Password;
	}

	public WebElement getBtn_SignIn() {
		return btn_SignIn;
	}

	public WebElement getChkbx_StaySignedIn() {
		return chkbx_StaySignedIn;
	}

	public WebElement getBtn_Yes() {
		return btn_Yes;
	}

	public WebElement getTxt_AllUsers() {
		return lbl_AllUsers;
	}

	public WebElement getBtn_NewUser() {
		return btn_NewUser;
	}

	public WebElement getTxtbx_UserName() {
		return txtbx_UserName;
	}

	public WebElement getTxtbx_Name() {
		return txtbx_Name;
	}

	public WebElement getTxtbx_FirstName() {
		return txtbx_FirstName;
	}

	public WebElement getTxtbx_LastName() {
		return txtbx_LastName;
	}

	public WebElement getDrpdwn_LocationDropDown() {
		return drpdwn_LocationDropDown;
	}

	public WebElement getLocation_Filter() {
		return location_filter;
	}

	public List<WebElement> getLocation_List() {
		return location_List;
	}

	public List<WebElement> getUserNames_List() {
		return txt_UserNames;
	}

	public WebElement getTxtbx_JobTitle() {
		return txtbx_JobTitle;
	}

	public WebElement getTxtbx_Department() {
		return txtbx_Department;
	}

	public WebElement getBtn_CreateUser() {
		return btn_CreateUser;
	}

	public WebElement getTxt_Notification() {
		return txt_Notification;
	}

	public WebElement getBtn_CloseNotification() {
		return btn_CloseNotification;
	}
}