package com.bs.pageobjects;

import com.bs.base.BaseClass;
import com.bs.utility.NewExcelLibrary;

public class ReadExcel extends BaseClass{
public static void main(String[] args) {
	
	

		NewExcelLibrary obj=new NewExcelLibrary();
		String a=(obj.getCellData("bubble", "gender", 2));
	System.out.println(a);
	obj.setCellData("bubble", "gender", 2, "500");
		

		
	}
}



		
			
			
	
	








