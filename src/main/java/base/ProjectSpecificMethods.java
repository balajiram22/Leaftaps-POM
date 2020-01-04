package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	public String dataSheetName;
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	@DataProvider
	public String[][] getData() throws IOException {
	return new ReadExcel().readExcel(dataSheetName);
	}
	
	
	
	
	
	
	
	
	
	
	
}
