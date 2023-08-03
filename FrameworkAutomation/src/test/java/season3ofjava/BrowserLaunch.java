package season3ofjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("configure.properties");
		Properties pr=new Properties();
		pr.load(fis);
		WebDriver driver=null;
		String browser=pr.getProperty("browser");
		/*switch(browser) {
		case "chromedriver":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		}*/
		if(browser.equalsIgnoreCase("chromedriver")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefoxdriver")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("edgedriver")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		driver.get(pr.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();

	}

}
