package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	WebDriver driver;
	JavascriptExecutor JSE;
	public void LaunchAUT() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public void mouseOver() throws InterruptedException {
		Actions obj=new Actions(driver);
		WebElement fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
		obj.moveToElement(fashion).perform();
		Thread.sleep(3000);
		WebElement men=driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
		Thread.sleep(2000);
		obj.moveToElement(men).click().perform();
		Thread.sleep(2000);
	}
	public void Right_Click() throws InterruptedException {
		Actions obj=new Actions(driver);
		WebElement rgt=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Thread.sleep(2000);
		obj.contextClick(rgt).perform();
	}

	public static void main(String[] args) throws InterruptedException {
		MouseAction obj=new MouseAction();
		obj.LaunchAUT();
		obj.mouseOver();
		obj.Right_Click();

	}

}
