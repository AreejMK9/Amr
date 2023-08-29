package com.orangehr.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Orange.library.Base;

public class LoginPage extends Base {
	public static final Logger log = LogManager.getLogger(LoginPage.class);

	private WebDriver driver;

	public LoginPage(WebDriver _driver) {
		if (_driver == null) {
			this.driver = ProjectLibrary.getDriver();
		} else {
			this.driver = _driver;
		}

	}

	public LoginPage() {
		if (this.driver == null) {
			this.driver = ProjectLibrary.getDriver();
		}
	}

	public LoginPage waiting() {
		ProjectLibrary.putOff(2);
		return this;
	}

	public LoginPage WrongUser(String username, String password) {
		ProjectLibrary.insertText(By.cssSelector(
				"#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input"),
				username);
		ProjectLibrary.insertText(By.cssSelector(
				"#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input"),
				password);
		ProjectLibrary.clickItem(By.cssSelector(
				"#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button"));
		
		return this;
	}
	 public LoginPage WrongPw(String username, String password) {
		 ProjectLibrary.insertText(By.cssSelector(
					"#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input"),
					username);
			ProjectLibrary.insertText(By.cssSelector(
					"#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input"),
					password);
			ProjectLibrary.clickItem(By.cssSelector(
					"#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button"));
		 
		 return this;
		 
	 }
	 public LoginPage CorrectUserPw (String username, String password) {
		 ProjectLibrary.insertText(By.cssSelector(
					"#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input"),
					username);
			ProjectLibrary.insertText(By.cssSelector(
					"#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input"),
					password);
			ProjectLibrary.clickItem(By.cssSelector(
					"#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button"));
		 
		 return this;
		  
	 }
	 
	 public LoginPage LogOutBtn() {
		 ProjectLibrary.clickItem(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i"));
		 ProjectLibrary.clickItem(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > ul > li:nth-child(4) > a"));
		 
		 return this;
	 }
	 public LoginPage ForgetPwBtn () {
		ProjectLibrary.clickItem(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")); 
		ProjectLibrary.clickItem(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[1]"));
		return this;
	 }
}