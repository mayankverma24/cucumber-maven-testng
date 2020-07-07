package com.org.cucumber;

import com.org.managers.DriverManager;
import com.org.managers.PageHelperManager;

public class TestContext {
	private DriverManager webDriverManager;
	// private PageObjectManager pageObjectManager;
	private PageHelperManager pageHelperManager;

	public TestContext() {
		webDriverManager = new DriverManager();
		// pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		pageHelperManager = new PageHelperManager(webDriverManager.getDriver());
	}

	public DriverManager getWebDriverManager() {
		return webDriverManager;
	}

	/*
	 * public PageObjectManager getPageObjectManager() { return pageObjectManager; }
	 */

	public PageHelperManager getPageHelperManager() {
		return pageHelperManager;
	}
}