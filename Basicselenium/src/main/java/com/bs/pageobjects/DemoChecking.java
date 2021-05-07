package com.bs.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoChecking  {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://quotedev.getmybubble.io/QuoteFlowV2/bq8u28-Los-Angeles-CA-90011/bq8u28/Los%20Angeles-CA-90011-US/life/previous/1");
		String a=driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[3]/p[2]/span")).getAttribute("_ngcontent-serverapp-c216");
		System.out.println(a);
	}

}
