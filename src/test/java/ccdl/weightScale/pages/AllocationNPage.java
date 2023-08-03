 package ccdl.weightScale.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import ccdl.weightScale.common.CommonMethod;
import ccdl.weightScale.common.GetScreenShot;
import ccdl.weightScale.drivers.PageDriver;

public class AllocationNPage extends CommonMethod {
	ExtentTest test;
	public AllocationNPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindBys({ 
		@FindBy(xpath = "//p[@class='oe_view_nocontent_create']"),

	})
	WebElement WCpageText;
		
		@FindBys ({
			@FindBy(xpath = "//button[contains(@type,'button')]")
			
		})
		WebElement CreateAllocation;
		
		@FindBys ({
			@FindBy(xpath = "//label[@for='name']")
			
		})
		WebElement UniqueAlloText;
		
		public void createAllocationN() throws InterruptedException, IOException {
			timeout(2000);
			try {
				if (WCpageText.isDisplayed()) {
					Assert.assertEquals(WCpageText.getText(), "There is no examples click here to add new Allocation Number.");
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>WCpageText assert is match.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WCpageTextDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "WCpageTextDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			
			try {
				if (CreateAllocation.isDisplayed()) {
					CreateAllocation.click();
					timeout(1000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>CreateAllocation button working as expected.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CreateAllocationDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "CreateAllocationDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>CreateAllocationis not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CreateAllocationLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "CreateAllocationLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(CreateAllocation.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			} 
			
			
			try {
				if (UniqueAlloText.isDisplayed()) {
					Assert.assertEquals(UniqueAlloText.getText(), "Unique Allocation Number");
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Text Assertion match .</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UniqueAlloTextDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "UniqueAlloTextDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				System.out.println(e);
		}
		
		}
	}


