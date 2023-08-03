package ccdl.weightScale.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import ccdl.weightScale.common.CommonMethod;
import ccdl.weightScale.common.GetScreenShot;
import ccdl.weightScale.drivers.PageDriver;

public class LoginPage extends CommonMethod {
	ExtentTest test;

	public LoginPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindBys({ @FindBy(xpath = "//input[@name='login']")

	})

	WebElement UserName;

	@FindBys({ @FindBy(xpath = "//input[@name='password']")

	})

	WebElement PassWord;

	@FindBys({ @FindBy(xpath = "//button[@type='submit']")

	})

	WebElement LoginButton;
	
	@FindBys({ @FindBy(xpath = "//h4[@class='o_MessageList_emptyTitle mb-3 fw-bolder']")

	})

	WebElement DashboardText;
	
	
	@FindBys({ @FindBy(xpath = "//i[@class='oi oi-apps']")

	})

	WebElement HomeMenu;
	
	@FindBys({ @FindBy(xpath = "//a[contains(@data-section,'475')]")

	})

	WebElement ClickOnWC;

	public void login() throws IOException {

		try {
			if (UserName.isDisplayed()) {
				UserName.sendKeys("qa_user");
				timeout();
				test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>User Name field working as expected.</b></p>");
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UserNameDone");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "UserNameDone.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail(
					"<p style=\"color:#FF5353; font-size:13px\"><b>User Name field is not locateable.Please check the error message</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UserNameLocator");
			String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "UserNameLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(UserName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}

		try {
			if (PassWord.isDisplayed()) {
				PassWord.sendKeys("1234");
				;
				timeout(2000);
				test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Password field working as expected.</b></p>");
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PasswordDone");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "PasswordDone.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail(
					"<p style=\"color:#FF5353; font-size:13px\"><b>Password field is not locateable.Please check the error message</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PasswordLocator");
			String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "PasswordLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(PassWord.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		try {
			if (LoginButton.isDisplayed()) {
				LoginButton.click();
				timeout(5000);
				test.pass(
						"<p style=\"color:#85BC63; font-size:13px\"><b>LoginButton field working as expected.</b></p>");
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LoginButtonDone");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "LoginButtonDone.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail(
					"<p style=\"color:#FF5353; font-size:13px\"><b>LoginButton field is not locateable.Please check the error message</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LoginButtonLocator");
			String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "LoginButtonLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(LoginButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}

		try {
			if (DashboardText.isDisplayed()) {
				Assert.assertEquals(DashboardText.getText(), "Congratulations, your inbox is empty");
				test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Assertion is match successfully.</b></p>");
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "assertDone");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "assertDone.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail(
					"<p style=\"color:#FF5353; font-size:13px\"><b>Assrtion is not match.Please check the error message</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "TextLocator");
			String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "TextLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(DashboardText.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		
	try {
		if (HomeMenu.isDisplayed()) {
			HomeMenu.click();
			test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Click on HomeMenu is match successfully.</b></p>");
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "HomeDone");
			String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "HomeDone.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}
	} catch (Exception e) {
		test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>HomeMenu is not locatable.Please check the error message</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "HomeLocator");
		String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "HomeLocator.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(HomeMenu.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
	
	try {
		if (ClickOnWC.isDisplayed()) {
			ClickOnWC.click();
			test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Click on Weight Scale successfully.</b></p>");
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WCclickDone");
			String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "WCclickDone.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}
	} catch (Exception e) {
		test.fail(
				"<p style=\"color:#FF5353; font-size:13px\"><b>Weight Scale is not locatable .Please check the error message</b></p>");
		Throwable t = new InterruptedException("Exception");
		test.fail(t);
		@SuppressWarnings("unused")
		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WCclickLocator");
		String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "WCclickLocator.png";
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		Assert.assertTrue(ClickOnWC.isDisplayed());
		PageDriver.getCurrentDriver().quit();
	}
  }
}