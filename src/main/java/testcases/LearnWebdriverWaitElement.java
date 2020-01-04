package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebdriverWaitElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//To open a Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//Loading a url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Finding an element and storing it into a variable
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Jeevakumar");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		//wait.until(ExpectedConditions.numberOfWindowsToBe(4));
		//wait.until(ExpectedConditions.alertIsPresent());
		
		wait.until(ExpectedConditions.
				elementToBeClickable(
						By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")));
		driver.findElementByXPath
		("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
		.click();
		
	}

}
