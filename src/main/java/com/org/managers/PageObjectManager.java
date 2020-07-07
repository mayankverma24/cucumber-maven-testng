package com.org.managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.UserDetailsPage;

public class PageObjectManager {

	private WebDriver driver;
	private UserDetailsPage userDetailsPage;
	private HomePage homePage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public UserDetailsPage getUserDetailsPage() {
		return (userDetailsPage == null) ? userDetailsPage = new UserDetailsPage(driver) : userDetailsPage;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
}