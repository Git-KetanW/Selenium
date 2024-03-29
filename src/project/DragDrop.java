package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public void Action() {
		Actions drg=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		drg.dragAndDrop(drag, drop).perform();
	}
	
	public void count() {
		int Cunt=driver.findElements(By.tagName("iframe")).size();
		System.out.println("The number of frames are: "+Cunt);
	}

	public static void main(String[] args) throws InterruptedException {
		DragDrop obj=new DragDrop();
		obj.LaunchAUT();
		obj.Action();
		obj.count();
	}

}
