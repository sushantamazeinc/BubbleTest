package com.bs.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bs.base.BaseClass;

public class LifeScore extends BaseClass{
	@FindBy(xpath="//body/ngb-modal-window[1]/div[1]/div[1]/app-lifescore-error-alert[1]/div[1]/button[1]")
	WebElement ok;
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-address-input[1]/div[1]/input[1]")
	WebElement address;
	@FindBy(xpath="//body/ngb-modal-window[1]/div[1]/div[1]/app-lifescore-error-alert[1]/div[1]/button[1]")
	WebElement tryok;
	@FindBy(className=("small-head-age"))
	WebElement age;
	@FindBy(xpath="//label[. = ' 56 - 65 ']")
	WebElement ageok;
	@FindBy(className = "select-box-input-text")
	WebElement gender;
	@FindBy(xpath="//label[. = 'Female ']")
	WebElement genderok;
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")
	WebElement requestACallBack;
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-lifescore-lead-capture[1]/div[2]/form[1]/div[1]/input[1]")
	WebElement name;
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-lifescore-lead-capture[1]/div[2]/form[1]/div[2]/input[1]")
	WebElement email;
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-lifescore-lead-capture[1]/div[2]/form[1]/div[3]/input[1]")
	WebElement phoneno;
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-lifescore-lead-capture[1]/div[2]/form[1]/label[1]/span[1]")
	WebElement checkbox;
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-lifescore-lead-capture[1]/div[2]/form[1]/button[1]")
	WebElement submit;
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[2]/div[1]/div[1]/div[1]/p[3]/button[1]")
	WebElement submitok;
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/app-lifescore[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/p[1]")
	WebElement lifescore;
	
	
	public LifeScore() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void life_score(String address1,String i,String j,String name1,String email1,String phone1) throws InterruptedException {
		Thread.sleep(3000);
		try {
			ok.click();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(3000);
		address.clear();
		address.sendKeys(address1);
		Thread.sleep(3000);
		address.sendKeys(Keys.ARROW_DOWN);
		address.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		/*
		 * try { tryok.click(); Thread.sleep(3000); } catch (Exception e) {
		 * System.out.println(e); }
		 */
		 
		age.click();
		getDriver().findElement(By.xpath("//div[3]/div/ul/li[" + i + "]/label")).click();
		gender.click();
		getDriver().findElement(By.xpath("//div[2]/div/ul/li[" + j + "]/label")).click();
		Thread.sleep(3000);
		String life=lifescore.getText();
		System.out.println(life);
		requestACallBack.click();
		name.sendKeys(name1);
		email.sendKeys(email1);
		phoneno.sendKeys(phone1);
		checkbox.click();
		submit.click();
		Thread.sleep(3000);
		submitok.click();
		
		
		
		
		
		
	}
}
