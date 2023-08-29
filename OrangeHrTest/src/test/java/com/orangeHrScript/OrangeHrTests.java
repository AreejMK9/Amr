package com.orangeHrScript;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.Orange.library.Base;
import com.orangehr.page.DashBoard;
import com.orangehr.page.LeavePage;
import com.orangehr.page.LoginPage;
import com.orangehr.page.PimPage;
import com.orangehr.page.TimePage;

public class OrangeHrTests extends Base {
	public static final Logger log = LogManager.getLogger(OrangeHrTests.class);

	@Test (enabled = false)

	public void LoginPageTest() {

		LoginPage logininfo = new LoginPage();

		logininfo.waiting();
		logininfo.WrongUser("Admine", "admin123");
		logininfo.waiting();
		logininfo.WrongPw("Admin", "Admin234");
		logininfo.waiting();
		logininfo.CorrectUserPw("Admin", "admin123");
		logininfo.waiting();
		logininfo.waiting();
		logininfo.ForgetPwBtn();
	}

	@Test (enabled = false)
	public void DashBoardTest() {
		LoginPage logininfo = new LoginPage();
		logininfo.CorrectUserPw("Admin", "admin123");

		DashBoard dashboardinfo = new DashBoard();
		dashboardinfo.waiting();
		dashboardinfo.AssignLeavBtn();
		driver.navigate().back();
		dashboardinfo.waiting();
		dashboardinfo.LeavRequest();
		driver.navigate().back();
		dashboardinfo.waiting();
		dashboardinfo.SelfReviewBtn();
		driver.navigate().back();
		dashboardinfo.waiting();
		dashboardinfo.SettingBtn();
		dashboardinfo.TimeSheetsIcon();
		driver.navigate().refresh();

	}

	@Test (enabled = false)
	public void PimPageTests() {
		LoginPage logininfo = new LoginPage();
		logininfo.CorrectUserPw("Admin", "admin123");
		PimPage pimlist = new PimPage();
		pimlist.waiting();
		pimlist.PiM();
		pimlist.waiting();
		pimlist.AddEmployee();
		pimlist.EmployeeDetails("Joe", "Smith", "2009");
		pimlist.ProfilePic();
		pimlist.CreateDetailsBtn("JoeAMK", "Smith3333", "Smith3333");
		driver.navigate().refresh();

	}
	@Test(enabled = false)
	public void LeaveInfoTests() {
		
		LoginPage logininfo = new LoginPage();
		logininfo.CorrectUserPw("Admin", "admin123");
		LeavePage leavholiday = new LeavePage();
		leavholiday.LeaveIcon();
		leavholiday.ConfigureDrop();
		leavholiday.HoliDaysBtn();
		leavholiday.DeleteBtn();
		leavholiday.AprroveLeavBtn();
			
	}
	@Test  
	public void TimeSheetTests() {
		LoginPage logininfo = new LoginPage();
		logininfo.CorrectUserPw("Admin", "admin123");
		TimePage timeinfo = new TimePage();
		timeinfo.TimeIcon();
		timeinfo.ViewBtn();
		timeinfo.CreateTimeSheet();
		timeinfo.EditBtn();
		timeinfo.AddrowBtn();
		
		
		
		
		
	}
		
	}

