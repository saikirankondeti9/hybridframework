package testscripts.regression;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.UtilKit;

public class ValidateLoginUsingExcelWithDataProvider2 extends BaseTest {
	@Test(dataProvider = "getData")
	public void StringteLoginTest1(HashMap<String,String> datamap) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(datamap.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(datamap.get("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertEquals(driver.getCurrentUrl(), datamap.get("Expected URL"));
		
	}
	@DataProvider
	public Object[][] getData() throws IOException{
		
		Object[][] data=new Object[1][1];
		data[0][0]=UtilKit.getTestData("TC-1");
		return data;
		
	
		
	}

}
