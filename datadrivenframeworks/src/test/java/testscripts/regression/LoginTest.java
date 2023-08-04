package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {

@Test
public void validateLoginTest() throws InterruptedException {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0607");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz456");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	Thread.sleep(2000);
	Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
}
@Test
public void validateLoginTest1() {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0612");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
}
@Test
public void validateLoginTest2() {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0602");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz457");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
}
@Test
public void validateLoginTest3() {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0607");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
}
}
