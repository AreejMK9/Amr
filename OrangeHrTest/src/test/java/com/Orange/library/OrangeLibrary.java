package com.Orange.library;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLibrary {

	public static final Logger log = LogManager.getLogger(OrangeLibrary.class);

	private WebDriver driver;

	public WebDriver getDriver() {

		return driver;
	}

	public void setDriver(WebDriver _driver) {
		if (_driver != null) {
			this.driver = _driver;
		}
	}

	private int wts = 120;

	public enum Browsers {
		CHROME
	}

	public WebDriver startABrowser(Browsers browser) throws Exception {
		switch (browser) {
		case CHROME:
			startChromeBrowser();
			break;
		default:

			startChromeBrowser();
			break;
		}
		putOff(5);

		log.info("maximize window...");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		waitForPageLoadCompelte();
		return driver;
	}

	private void waitForPageLoadCompelte() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wts));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(wts));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(wts));
	}

	private void startChromeBrowser() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
	}

	public void insertText(By by, String insertString) {

		WebElement textElement = driver.findElement(by);
		textElement.clear();
		textElement.sendKeys(insertString);
	}

	public void clean(By by) {
		WebElement delettext = driver.findElement(by);
		delettext.sendKeys(Keys.CONTROL+"a");
		delettext.sendKeys(Keys.DELETE);

	}

	public void dropDownOption(By by, String optionList) {

		WebElement dropDownElem = driver.findElement(by);
		Select select = new Select(dropDownElem);
		select.selectByVisibleText(optionList);
	}

	public void clickItem(By by) {
		WebElement element = driver.findElement(by);
		element.click();

	}

	public void chooseOption(WebElement list) {
		Actions action = new Actions(driver);
		action.click(list).build().perform();

	}

	public WebElement waitForItemVisibility(By by) {
		WebElement item = null;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(wts));
		item = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return item;
	}

	public void putOff(double inSeconds) {
		try {
			Thread.sleep((long) (inSeconds * 1000));
		} catch (Exception e) {
			log.error("Error: ", e);
		}
	}

	public void selectElem(By by, By option) {
		WebElement OptionsHr = driver.findElement(by);
		WebElement optS = OptionsHr.findElement(option);
		optS.click();
	}

	public void listOptions(By by, String Holioption) {
		WebElement optionListA = driver.findElement(by);

		Select holiList = new Select(optionListA);
		holiList.selectByValue(Holioption);

	}

	public void MoveToElementAndclicke(WebElement element) {

		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();

	}

	public void selectValue(By by, String string) {
		WebElement optionListB = driver.findElement(by);
		Select optionList = new Select(optionListB);
		optionList.selectByVisibleText(string);

	}

	public void handleCheckBox(By by, boolean ischecked) {

		WebElement checkBox = driver.findElement(by);
		// user wants to check the box
		if (ischecked == true) {

			if (checkBox.isSelected()) {
				// box is already selected ----> do nothing
			} else {
				// box is empty (Not selected) ----> click
				checkBox.click();
			}

		}

	}
	
	public void scrollIntoView(WebElement oranghr) {
		Actions action = new Actions(driver);
		action.scrollToElement(oranghr).build().perform();
		
	}


	

	public void fileUpload(By by, String employeephoto) {
		WebElement uploadElem = driver.findElement(by);
		String hrphoto = (employeephoto);
		uploadElem.sendKeys(hrphoto);
		
	}
	public void HiddenElementClick(By by) {
        WebElement Orelem = driver.findElement(by);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", Orelem);

        Orelem.click();

    }

}