package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTestUsingDataProvider extends BaseTest {
@Test(dataProvider = "getData")
public void validateLogin1(String userid,String pswd,String exptitle) throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userid);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pswd);
	driver.findElement(By.xpath("//input[@name='login']")).click();
	Thread.sleep(2000);
	Assert.assertEquals(driver.getTitle(), exptitle);
	
}
@DataProvider
public Object[][] getData(){
	Object[][] inputData=new Object[4][3];
	inputData[0][0]="reyaz0607";
	inputData[0][1]="reyaz456";
	inputData[0][2]="Adactin.com - Hotel Reservation System";
	
	inputData[1][0]="reyaz0606";
	inputData[1][1]="reyaz456";
	inputData[1][2]="Adactin.com - Hotel Reservation System";
	
	inputData[2][0]="reyaz0607";
	inputData[2][1]="reyaz453";
	inputData[2][2]="Adactin.com - Hotel Reservation System";
	
	inputData[3][0]="reyaz0606";
	inputData[3][1]="reyaz455";
	inputData[3][2]="Adactin.com - Hotel Reservation System";
	return inputData;
	
}
}
