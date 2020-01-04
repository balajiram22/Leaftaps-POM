package pages;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	public LoginPage enterUserName(String data) {
		driver.findElementByName("USERNAME").sendKeys(data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
		/*HomePage obj = new HomePage();
		return obj;*/
	}
	
	
	
	
	
	
	
	
	
	
}
