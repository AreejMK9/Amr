package com.orangehr.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Orange.library.Base;

public class PimPage extends Base {
	public static final Logger log = LogManager.getLogger(PimPage.class);

	private WebDriver driver;

	public PimPage(WebDriver _driver) {
		if (_driver == null) {
			this.driver = ProjectLibrary.getDriver();
		} else {
			this.driver = _driver;
		}

	}

	public PimPage() {
		if (this.driver == null) {
			this.driver = ProjectLibrary.getDriver();
		}
	}

	public PimPage waiting() {
		ProjectLibrary.putOff(2);
		return this;

	}

	public PimPage PiM() {
		ProjectLibrary.clickItem(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(2) > a"));
		return this;
	}

	public PimPage AddEmployee() {
		ProjectLibrary.clickItem(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		return this;
	}

	public PimPage EmployeeDetails(String Firstname, String Lastname, String Id) {
		ProjectLibrary.insertText(By.name("firstName"), Firstname);
		ProjectLibrary.insertText(By.name("lastName"), Lastname);
		ProjectLibrary.clean(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div:nth-child(1) > div.oxd-grid-2.orangehrm-full-width-grid > div > div > div:nth-child(2) > input"));
		ProjectLibrary.insertText(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"),
				Id);
		return this;
	}

	public PimPage ProfilePic() {

		ProjectLibrary.fileUpload(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-image > div > div:nth-child(2) > input"),
				"C:\\Users\\aketa\\Downloads\\profilephoto.png");

		return this;

	}

	public PimPage CreateDetailsBtn(String username, String password, String confirm) {
		ProjectLibrary.handleCheckBox(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div.oxd-form-row.user-form-header > div > label > span"),
				true);
		ProjectLibrary.insertText(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"),
				username);
		ProjectLibrary.insertText(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"),
				password);
		ProjectLibrary.insertText(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"),
				confirm);
		ProjectLibrary.clickItem(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"));

		return this;
	}

}
