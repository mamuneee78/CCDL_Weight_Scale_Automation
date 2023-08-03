 package ccdl.weightScale.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class AlloFormPage extends CommonMethod {
	ExtentTest test;
	public AlloFormPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	} 
		 @FindBys({
			@FindBy(xpath = "//select[@id='allocation_type']"),

		})
		WebElement AlloType;
		
		@FindBys ({
			@FindBy(xpath = "//input[contains(@id,'src_location_id')]")
			
		})
		WebElement SrcLoc;
		
		@FindBys ({
			@FindBy(xpath = "//input[contains(@id,'dest_location_id')]")
			
		})
		WebElement DestLoc;
		
		@FindBys ({
			@FindBy(xpath = "(//input[@type='text'][contains(@id,'id')])[1]")
			
		})
		WebElement Department;
		
		@FindBys ({
			@FindBy(xpath = "//input[contains(@id,'purchase_id')]")
			
		})
		WebElement POselect;
		
		
		
		
		public void alloFormFill() throws InterruptedException, IOException {
			
			timeout(1000);
			
			try {
				if (AlloType.isDisplayed()) {
					Select select = new Select(AlloType);
					select.selectByIndex(2);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>AlloType Selected.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AlloTypeDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "AlloTypeDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>AlloType not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AlloTypeLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "AlloTypeLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(AlloType.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			try {
				if (SrcLoc.isDisplayed()) {
					SrcLoc.sendKeys("WH/Stock");
					timeout(2000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>SrcLoc Selected.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SrcLocDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "SrcLocDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>SrcLoc not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SrcLocLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "SrcLocLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(SrcLoc.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			
			
			try {
				if (DestLoc.isDisplayed()) {
					DestLoc.sendKeys("WH/Input/Order Processing");
					timeout(2000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>DestLoc Selected.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "DestLocDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "DestLocDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>DestLoc not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "DestLocLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "DestLocLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(DestLoc.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			
			try {
				if (Department.isDisplayed()) {
					Department.sendKeys("DevOps");
					timeout(3000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Department Selected.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "DepartmentDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "DepartmentDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Department not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "DepartmentLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "DepartmentLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Department.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
			try {
				if (POselect.isDisplayed()) {
					POselect.click();
					timeout(1000);
					POselect.sendKeys(Keys.ENTER);
					
//					JavascriptExecutor js = (JavascriptExecutor) driver;
//					js.executeScript("window.scrollBy(0,400)");
					timeout(4000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>PO has been Selected.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "POselectDone");
					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "POselectDone.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>POSelect not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "POselectLocator");
				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "POselectLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(POselect.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
//			try {
//				if (CreateAllocation.isDisplayed()) {
//					CreateAllocation.click();
//					timeout(1000);
//					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>CreateAllocation button working as expected.</b></p>");
//					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CreateAllocationDone");
//					String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "CreateAllocationDone.png";
//					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//				}
//			} catch (Exception e) {
//				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>CreateAllocationis not locateable.Please check the error message.</b></p>");
//				Throwable t = new InterruptedException("Exception");
//				test.fail(t);
//				@SuppressWarnings("unused")
//				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CreateAllocationLocator");
//				String dest = System.getProperty("user.dir") + "\\ScreenShot\\" + "CreateAllocationLocator.png";
//				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//				Assert.assertTrue(CreateAllocation.isDisplayed());
//				PageDriver.getCurrentDriver().quit();
//			} 
		
		}
	}

