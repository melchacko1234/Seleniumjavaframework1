package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataprovider {
	
	@Test(dataProvider="test1data")
	public void test1(String username,String password)
	{
		System.out.println(username+" | "+password);
	}

		@DataProvider(name="test1data")
	public Object[][] getdata()
	{
		String excelPath="C:/User/Agnal/workspace/seleniumjavaframework1/Excel/data.xlsx";
		Object data [][]=testdata(excelPath,"Sheet1");
		return data; 
	}
	public static Object[][] testdata(String excelPath, String sheetName)
	{
		Excelutils excel= new Excelutils(excelPath, sheetName);

		int rowcount=excel.getrowcount();
		int colcount=excel.getcolcount();

		Object data[][]= new Object[rowcount-1][colcount];

		for(int i=1;i<rowcount;i++){
			for(int j=0;j<colcount;j++){


				String celldata=excel.getcelldatastring(i, j);
				System.out.println(celldata+ " ");
				data[i-1][j]=celldata;
			}
			System.out.println();
		}
		return data;
	}



}




