package com.orangehr.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Orange.library.Base;

public class TimePage extends Base {
	public static final Logger log = LogManager.getLogger(TimePage.class);

	private WebDriver driver;

	public TimePage(WebDriver _driver) {
		if (_driver == null) {
			this.driver = ProjectLibrary.getDriver();
		} else {
			this.driver = _driver;
		}

	}

	public TimePage() {
		if (this.driver == null) {
			this.driver = ProjectLibrary.getDriver();
		}
	}

	public TimePage waiting() {
		ProjectLibrary.putOff(2);
		return this;
	}
	
	public TimePage TimeIcon() {
		ProjectLibrary.putOff(3);
		ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(4)"));
		return this;
	}
	
	public TimePage ViewBtn() {
		ProjectLibrary.insertText(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-card-container > form > div.oxd-form-row > div > div > div > div:nth-child(2) > div > div > input"), "Joe Root");
		ProjectLibrary.putOff(2);
		WebElement employeename = driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-card-container > form > div.oxd-form-row > div > div > div > div:nth-child(2) > div > div > input"));
		employeename.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		ProjectLibrary.putOff(2);
		ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-card-container > form > div.oxd-form-actions > button"));
		return this;
		
	}
	public TimePage CreateTimeSheet() {
		ProjectLibrary.putOff(2);
		ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > form > div.orangehrm-timesheet-footer > div.orangehrm-timesheet-footer--options > button"));
		return this;
	}
public TimePage EditBtn () {
	ProjectLibrary.clickItem(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[1]"));
	ProjectLibrary.insertText(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > form > div.orangehrm-timesheet-body > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div:nth-child(2) > div > div > input"), "Apache Software");
	ProjectLibrary.putOff(2);
	WebElement projectname = driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > form > div.orangehrm-timesheet-body > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div:nth-child(2) > div > div > input"));
	projectname.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	ProjectLibrary.putOff(2);
	ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > form > div.orangehrm-timesheet-body > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div:nth-child(2) > div > div > div.oxd-select-text--after > i"));
	ProjectLibrary.putOff(2);
	WebElement QAtesting = driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > form > div.orangehrm-timesheet-body > table > tbody > tr:nth-child(1) > td:nth-child(2) > div > div:nth-child(2) > div > div"));
	ProjectLibrary.chooseOption( QAtesting);
	ProjectLibrary.insertText(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > form > div.orangehrm-timesheet-body > table > tbody > tr:nth-child(1) > td:nth-child(4) > div > div:nth-child(2) > input"), "3:00");
	ProjectLibrary.putOff(2);
	
	return this;
}

public TimePage AddrowBtn() {
	ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > form > div.orangehrm-timesheet-body > table > tbody > tr:nth-child(2) > td > button"));
	ProjectLibrary.putOff(2);
	ProjectLibrary.clickItem(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[3]"));
	return this;
}
}
