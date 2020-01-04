package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebdriverWait {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Loading a url
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		Actions builder = new Actions(driver);
		WebElement Ele = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement apple = driver.findElementByXPath("//a[text()='Apple']");
		builder.moveToElement(Ele).perform();
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(apple));	
		builder.click(apple).perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
