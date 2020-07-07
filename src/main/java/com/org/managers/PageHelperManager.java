package com.org.managers;

import org.openqa.selenium.WebDriver;

import pageHelpers.HomeHelper;
import pageHelpers.UserDetailsHelper;

public class PageHelperManager {

	private WebDriver driver;
	private UserDetailsHelper userDetailsHelper;
	private HomeHelper homeHelper;

	public PageHelperManager(WebDriver driver) {
		this.driver = driver;
	}

	public UserDetailsHelper getUserDetailsHelper() {
		return (userDetailsHelper == null) ? userDetailsHelper = new UserDetailsHelper(driver) : userDetailsHelper;
	}

	public HomeHelper getHomeHelper() {
		return (homeHelper == null) ? homeHelper = new HomeHelper(driver) : homeHelper;
	}
}