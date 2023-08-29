package com.orangehr.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Orange.library.Base;

public class DashBoard extends Base {
	public static final Logger log = LogManager.getLogger(DashBoard.class);

	private WebDriver driver;

	public DashBoard(WebDriver _driver) {
		if (_driver == null) {
			this.driver = ProjectLibrary.getDriver();
		} else {
			this.driver = _driver;
		}

	}

	public DashBoard() {
		if (this.driver == null) {
			this.driver = ProjectLibrary.getDriver();
		}
	}
	
		public DashBoard waiting() {
			ProjectLibrary.putOff(2);
			return this;
		}
		
		public DashBoard AssignLeavBtn () {
			ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div:nth-child(3) > div > div.orangehrm-dashboard-widget-body > div > div:nth-child(1) > button"));
			
			return this;
		}
		
		public DashBoard LeavRequest () {
			ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div:nth-child(2) > div > div.orangehrm-dashboard-widget-body > div > div:nth-child(1) > p"));
			return this;
		}
		public DashBoard SelfReviewBtn () {
			ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div:nth-child(2) > div > div.orangehrm-dashboard-widget-body > div > div:nth-child(3) > p"));
			return this;
		}
		
	public DashBoard SettingBtn () {
		ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div:nth-child(5) > div > div.orangehrm-dashboard-widget-header > i"));
		ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div:nth-child(5) > div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered > div > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--ghost"));
		return this;
	}
		
	public DashBoard TimeSheetsIcon () {
		ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div:nth-child(3) > div > div.orangehrm-dashboard-widget-body > div > div:nth-child(6) > button"));
		return this;
		
	}
}
	
	
	
	
	
	
	
	
