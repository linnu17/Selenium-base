package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingAction extends Base{
	public void verify_keyboardactions() throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		  
	}
	public void verify_draganddrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
	}
	public void verify_rightclick() {
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions act=new Actions(driver);
		act.contextClick(home).build().perform();
	}
	public void verify_mousehover() {
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions act= new Actions(driver);
		act.moveToElement(home).build().perform(); 
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		 HandlingAction action=new  HandlingAction();
		 action.initialize();
		 action.verify_mousehover();
		 action.verify_rightclick();
		 action.verify_draganddrop();
		 try {
			action.verify_keyboardactions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
