package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptJava {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void SendData() throws InterruptedException {
		jse=(JavascriptExecutor)driver;
		WebElement User=driver.findElement(By.id("username"));
		jse.executeScript("arguments[0].value='some@nothing.com';", User);
		Thread.sleep(2000);
		WebElement Pass=driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].value='Nobuddy';", Pass);
		Thread.sleep(2000);
	}
	public void Click_() {
		jse=(JavascriptExecutor)driver;
		WebElement logIn=driver.findElement(By.id("Login"));
		jse.executeScript("arguments[0].click();", logIn);
	}

	public static void main(String[] args) throws InterruptedException {
		ScriptJava obj=new ScriptJava();
		obj.LaunchAUT();
		obj.SendData();
		obj.Click_();
		
	}

}
