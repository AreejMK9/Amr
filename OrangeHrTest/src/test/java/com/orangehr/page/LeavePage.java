package com.orangehr.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Orange.library.Base;

public class LeavePage extends Base {
	public static final Logger log = LogManager.getLogger(LeavePage.class);

	private WebDriver driver;

	public LeavePage(WebDriver _driver) {
		if (_driver == null) {
			this.driver = ProjectLibrary.getDriver();
		} else {
			this.driver = _driver;
		}

	}

	public LeavePage() {
		if (this.driver == null) {
			this.driver = ProjectLibrary.getDriver();
		}
	}

	public LeavePage waiting() {
		ProjectLibrary.putOff(2);

		return this;
	}

	public LeavePage LeaveIcon() {
		ProjectLibrary.clickItem(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(3) > a"));
		return this;

	}

	public LeavePage ConfigureDrop() {
		ProjectLibrary.clickItem(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/span/i"));
		ProjectLibrary.putOff(4);
		return this;
	}

	public LeavePage HoliDaysBtn() {

		ProjectLibrary.clickItem(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/ul/li[4]/a"));
		ProjectLibrary.putOff(4);
		return this;
	}

	public LeavePage DeleteBtn() {
		ProjectLibrary.putOff(3);
		WebElement holiday = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[16]/div/div[2]"));
		ProjectLibrary.scrollIntoView(holiday);

		ProjectLibrary.putOff(3);
		ProjectLibrary.handleCheckBox(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div:nth-child(16) > div > div:nth-child(1) > div > div > label > span"),
				true);
		ProjectLibrary.putOff(3);
		ProjectLibrary.clickItem(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[16]/div/div[6]/div/button[1]"));
		ProjectLibrary.putOff(5);

		ProjectLibrary.clickItem(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[1]"));

		return this;
	}

	public LeavePage AprroveLeavBtn() {
		
	ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(3) > a"));
	ProjectLibrary.putOff(2);
	ProjectLibrary.clickItem(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[1]/div/div[9]/div/button[1]"));
	

		return this;

	}
}
