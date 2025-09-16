package seleniumbasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Base {
	public WebDriver driver;
	
	public void initialize()
	{
	 driver= new ChromeDriver(); 
//	 driver= new EdgeDriver(); //
	
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize(); 
	}
	public void browserclose()
	{
		// driver.close();//tab
		// windowdriver.quit();  //window
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Base();
		base.initialize();
		base.browserclose();
	

	}

}
