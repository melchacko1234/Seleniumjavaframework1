package utils;

public class Excelutilsdemo {

	public static void main(String[] args) {
		String projectpath=System.getProperty("user.dir");
		Excelutils excel= new Excelutils(projectpath + "/Excel/data.xlsx", "Sheet1");

		excel.getrowcount();
		excel.getcelldatastring(0, 0);
		excel.getcelldatanumeric(1, 1);
	}

}
