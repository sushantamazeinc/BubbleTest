package com.bs.dataprovider;

import org.testng.annotations.DataProvider;

import com.bs.utility.NewExcelLibrary;

	public class DataProviders {
		NewExcelLibrary obj=new NewExcelLibrary();
		@DataProvider(name = "Bubblee")
		public Object[][] getProject() {
	// Totals rows count
			int rows = obj.getRowCount("bubble");
	// Total Columns
			int column = obj.getColumnCount("bubble");
			int actRows = rows - 1;

			Object[][] data = new Object[actRows][column];

			for (int i = 0; i < actRows; i++) {
				for (int j = 0; j < column; j++) {
					data[i][j] = obj.getCellData("bubble", j, i + 2);
		}
	}
			return data;
}


}











