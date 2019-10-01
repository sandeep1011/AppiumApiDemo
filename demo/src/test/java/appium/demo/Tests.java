package appium.demo;


import java.io.FileReader;

import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import junit.framework.Assert;





public class Tests extends BaseClass {
	
	
	
	
	@Test
	public void testOne() throws Exception {
		ExtentHtmlReporter htmlReporters = new ExtentHtmlReporter("extentReportOne.html");
		ExtentReports extents = new ExtentReports();
	    extents.attachReporter(htmlReporters);
		
		ExtentTest test1 = extents.createTest("TestOne","Sample Test case for Animation");
		
		
		jsonData js = new jsonData();
		test1.log(Status.INFO, "Test One started");
		driver.findElement(By.xpath(js.string1)).click();
		test1.log(Status.PASS, "click done app");
		driver.findElement(By.xpath(js.string2)).click();
		test1.log(Status.PASS, "Hide buttons");
		Thread.sleep(2000);
		driver.findElement(By.xpath(js.string4)).click();
		driver.findElement(By.xpath(js.string5)).click();
		driver.findElement(By.xpath(js.string6)).click();
		driver.findElement(By.xpath(js.string7)).click();
		test1.log(Status.PASS, "All buttons hidden");
		try {
		if(driver.findElements(By.xpath(js.string6)).size() != 0){
			System.out.println("Element is Present");
			}else{
			System.out.println("Element is Absent");
			}
		}catch(Exception er) {
			er.getMessage();
		}
		driver.findElementById(js.string8).click();
		
		try {
			if(driver.findElements(By.xpath(js.string6)).size() != 0){
				System.out.println("Element is Present");
				}else{
				System.out.println("Element is Absent");
				}
			}catch(Exception er) {
				er.getMessage();
			}
		
		test1.log(Status.INFO, "Test One Completed");
		extents.flush();
		driver.navigate().back();
		driver.navigate().back();
		
		
	}
	
	@Test
	public  void testtwo() throws InterruptedException{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentTwo.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test2 = extent.createTest("TestTwo","Verify Title");
		test2.log(Status.INFO, "Test Two started");
		jsonData js = new jsonData();
		driver.findElement(By.xpath(js.string9)).click();
		test2.log(Status.PASS, "Click on app icon");
		Thread.sleep(1000);
		driver.findElementById(js.string10).click();
		test2.log(Status.PASS, "Click on action bar icon");
		driver.findElement(By.xpath(js.string11)).click();		
		test2.log(Status.PASS, "Click on display options");
		String titletext = driver.findElementByClassName("android.widget.TextView").getText();
		test2.log(Status.PASS, "getting the text for title");
		Assert.assertEquals(titletext, "App/Action Bar/Display Options");
		test2.log(Status.PASS, "assert task done");
		driver.findElementById(js.string12).click();
		driver.findElementById(js.string12).click();
		String titletext2 = driver.findElementByClassName("android.widget.TextView").getText();
		Assert.assertEquals(titletext, "App/Action Bar/Display Options");
		System.out.println("Title of page is verified");
		test2.log(Status.PASS, "assert task done");
		test2.log(Status.INFO, "Test two Completed");
		extent.flush();
	}
	

}
