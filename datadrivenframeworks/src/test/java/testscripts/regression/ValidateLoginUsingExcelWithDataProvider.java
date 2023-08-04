package testscripts.regression;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLoginUsingExcelWithDataProvider extends BaseTest {
	@Test(dataProvider = "getData")
	public void validateLoginTest1(String username,String password,String expURL) {
		driver.findElement(By.xpath("")).sendKeys(username);
		driver.findElement(By.xpath("")).sendKeys(password);
		driver.findElement(By.xpath("")).click();
		Assert.assertEquals(driver.getCurrentUrl(), expURL);
		
	}
	@DataProvider
	public Object[][] getData() throws IOException{
		FileInputStream fis=new FileInputStream("");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int noOfRows=ws.getLastRowNum()+1;
		int noOfCells=ws.getRow(0).getLastCellNum();
		Object[][] data=new Object[noOfRows][noOfCells];
		for(int i=0;i<noOfRows;i++)
		{
			for(int j=0;j<noOfCells;j++) {
				data[i][j]=ws.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		return data;
		
	}

}
