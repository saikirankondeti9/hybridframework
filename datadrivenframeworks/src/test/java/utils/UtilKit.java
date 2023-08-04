package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilKit {
	public static HashMap<String,String> getTestData(String testCase) throws IOException{
		FileInputStream fIS= new FileInputStream("src\\test\\resources\\testdata\\excels\\testingdata.xlsx");
		XSSFWorkbook wB=new XSSFWorkbook(fIS);
		XSSFSheet sh=wB.getSheet("Sheet1");
		ArrayList<Row> testcaseRows=getTestcaseRows(sh,testCase);
		HashMap<String, String> hMap=new HashMap<String,String>();
		for(int i=0;i<testcaseRows.size();i++) {
			int noOfCells=testcaseRows.get(0).getPhysicalNumberOfCells()-1;
			for(int j=1;j<=noOfCells;j++) {
				hMap.put(testcaseRows.get(i).getCell(j).getStringCellValue(), testcaseRows.get(1).getCell(j).getStringCellValue());
		}}
		return hMap;
		
	}

	private static ArrayList<Row> getTestcaseRows(XSSFSheet sh, String testCase) {
		// TODO Auto-generated method stub
		ArrayList<Row> allRows=new ArrayList<Row>();
		for(int i=0;i<=sh.getLastRowNum();i++) {
			if(!(sh.getRow(i)==null)) {
				allRows.add(sh.getRow(i));
			}
		}
		ArrayList<Row> testCaseRows=new ArrayList<Row>();
		for(int i=0;i<allRows.size();i++) {
			if(allRows.get(i).getCell(0).getStringCellValue().equalsIgnoreCase(testCase)) {
				
				testCaseRows.add(allRows.get(i));
			}
		}
		return testCaseRows;
		
	}
	
}
