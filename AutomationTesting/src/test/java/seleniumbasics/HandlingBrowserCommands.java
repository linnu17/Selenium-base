package seleniumbasics;

public class HandlingBrowserCommands extends Base {
	public void verifycommands()
	{
String title=driver.getTitle();
System.out.println(title);
String currenturl=driver.getCurrentUrl();
System.out.println(currenturl);
String handleid=driver.getWindowHandle();
System.out.println(handleid);
String pagesource=driver.getPageSource();
System.out.println(pagesource);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingBrowserCommands browsercommand=new HandlingBrowserCommands();
browsercommand.initialize();
browsercommand.verifycommands();
	}

}
