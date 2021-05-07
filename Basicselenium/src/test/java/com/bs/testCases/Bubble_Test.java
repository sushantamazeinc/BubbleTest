package com.bs.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bs.base.BaseClass;
import com.bs.dataprovider.DataProviders;
import com.bs.pageobjects.LifeScore;


public class Bubble_Test extends BaseClass {
	@Test(dataProvider = "Bubblee", dataProviderClass = DataProviders.class)
	public void bubble_test(String address1, String i, String j, String name1, String email1, String phone1) throws InterruptedException {
	logger=	report.createTest("bubble_test");
		LifeScore ls=new LifeScore();
		logger.info("Entering Details");
		ls.life_score(address1, i, j, name1, email1, phone1);
	}
	@BeforeMethod()
	public void setup() {
	launchApp();
	}

	@AfterMethod()
	public void tearDown() {
	//getDriver().quit();
	}

}
