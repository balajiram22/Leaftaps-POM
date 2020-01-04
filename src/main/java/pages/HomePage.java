package pages;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public HomePage verifyLogin() {
		String text = driver.findElementByTagName("h2").getText();
		if (text.contains("Demo")) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}
		return this;
	}
	
	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}
	
	
	
	
	
	
	
	
	
	
}
