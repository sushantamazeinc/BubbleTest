package com.bs.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bs.base.BaseClass;

public class DragandDrop extends BaseClass  {
	
	 
	@FindBy(id="draggable")
	WebElement drag;
	@FindBy(id="droppable")
	WebElement drop;
	
	public DragandDrop() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void dragdrop() {
		logger=report.createTest("Drag And Drop");
		//logger.info("Performing Action on Drag And Drop");
		Actions act=new Actions(getDriver());
		act.dragAndDrop(drag, drop).build().perform();
		//logger.info("Performed");
	}
	
	
	
	 
	 
	  
	   
	   
	   
	  
	    
	   
}
