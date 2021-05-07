package testcases;



import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.bs.base.BaseClass;
import com.bs.pageobjects.DragandDrop;

public class DragdropTest extends BaseClass   {
	public ExtentTest logger;
	
	// DragandDrop dp=new DragandDrop();
	@Test
	public void drag() {
		
	
	logger=report.createTest("Drag And Drop");
		DragandDrop dp = new DragandDrop();
		dp.dragdrop();
	}
	
	

}
