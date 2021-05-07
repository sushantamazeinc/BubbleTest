package com.bs.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	
	public static Properties prop;
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	public  ExtentReports report;
	public ExtentTest logger;


	
	@BeforeSuite()
	public void loadConfig() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ExtentHtmlReporter reports=new ExtentHtmlReporter("C:\\Users\\USER\\git\\seleniumframework\\Basicselenium\\TestOutput\\ExtentReport\\ExtentReportsresults.html");
		 report = new ExtentReports();
		 report.attachReporter(reports);
	}
	

	public static WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver.get();
	}

	public void launchApp() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			

			// Set Browser to ThreadLocalMap
			driver.set(new ChromeDriver());
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
		}
		//Maximize the screen
		getDriver().manage().window().maximize();
		//Delete all the cookies
		getDriver().manage().deleteAllCookies();
		//Implicit TimeOuts
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		getDriver().get(prop.getProperty("url"));
		
	}

	@AfterSuite()
	public void afterSuite() {
		report.flush();
		
	}

}
