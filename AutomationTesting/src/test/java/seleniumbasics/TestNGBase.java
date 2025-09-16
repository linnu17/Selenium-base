package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	public WebDriver driver ;
	@BeforeMethod
	public void browserInitialization() {
		 driver = new ChromeDriver(); //webdriver interface chromedriver class driver ref variable
	driver.get( "https://www.saucedemo.com/v1/");//to launge url use get method
		driver.manage().window().maximize();//maximize window
		//driver.close(); //to close the current window
		//driver.quit();// to close the complete window
	}
//  @AfterMethod
	//public void browserQuitClose() {
	
		//driver.close();
	//	driver.quit();
	
	}


