package seleniumbasics;

public class Handlingnavigation extends Base{
 public void verifynavigationcommands()
 {
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Handlingnavigation navigation=new Handlingnavigation();
 navigation.initialize();
 navigation.verifynavigationcommands();

	}

}
