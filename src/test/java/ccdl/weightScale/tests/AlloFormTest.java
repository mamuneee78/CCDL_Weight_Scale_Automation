package ccdl.weightScale.tests;



import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import ccdl.weightScale.common.ExtentFactory;
import ccdl.weightScale.drivers.BaseDriver;
import ccdl.weightScale.drivers.PageDriver;
import ccdl.weightScale.pages.AlloFormPage;
import ccdl.weightScale.pages.AllocationNPage;
import ccdl.weightScale.pages.LoginPage;

public class AlloFormTest extends BaseDriver {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void openUrl() {
//		PageDriver.getCurrentDriver().manage().window().maximize();
//		PageDriver.getCurrentDriver().get(url);
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>CCDL_WeightScale_AllForm</b></p>").assignAuthor("QA TEAM").assignDevice("Windows");
		
	}

	@Test
	public void createAllocationTest() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>AlloForm Test</b></p>");
		AlloFormPage allocatonPage = new AlloFormPage(childTest);
		allocatonPage.alloFormFill();
		
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
