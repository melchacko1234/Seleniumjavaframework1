package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	//@SuppressWarnings("deprecation")
	public Excelutils(String excelPath ,String sheetName)
	{
		try
		{

			projectpath=System.getProperty("user.dir");
			//@SuppressWarnings("deprecation")
			workbook = new XSSFWorkbook(excelPath);
			sheet= workbook.getSheet("sheetName");
		}
		catch (Exception  exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}


	}
	public static void main(String[] args) {
		getrowcount();
		getcelldatastring(0,0);
		getcelldatanumeric(1,1);
	}

	public static int getrowcount()
	{
		int rowcount=0;
		try
		{

			rowcount= sheet.getPhysicalNumberOfRows();
			System.out.println( "the total no of rows "+ rowcount);
		}
		catch (Exception  exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return rowcount;
	}

	public static int getcolcount()
	{
		int colcount=0;
		try
		{

			colcount= sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println( "the total no of columns "+ colcount);
		}
		catch (Exception  exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colcount;
	}






	public static String getcelldatastring(int rowNum, int colNum)
	{
		String celldata=null;
		try
		{


			celldata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue().toString();
			System.out.println(celldata);

		}
		catch (Exception  exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
return celldata;
	}


	public static void getcelldatanumeric(int rowNum ,int colNum)
	{
		try
		{

			double celldata=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldata);
		}
		catch (Exception  exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

}
