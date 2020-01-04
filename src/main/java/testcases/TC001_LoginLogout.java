package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC001_LoginLogout extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		dataSheetName="TC001";
	}
	
	@Test(dataProvider="getData")
	public void tc001_loginLogout(String uName, String pwd) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyLogin()
		.clickLogout();
		
		
		
		
		
		
		/*LoginPage obj = new LoginPage();
		obj.enterUserName();
		obj.enterPassword();
		obj.clickLogin();*/
		

	}
	
	
	
	
	
	
	
	
	
	
	
}
