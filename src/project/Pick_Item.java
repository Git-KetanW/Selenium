package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pick_Item {
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void LaunchAUT() throws InterruptedException {
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public void Scrolling() throws InterruptedException {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(2000);
	}
	public void Mid() throws InterruptedException {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		WebElement ketu=driver.findElement(By.xpath("//img[@alt='Travel Adapters And Electronic Accessories from RTS']"));
		if(ketu.isDisplayed()) {
			jse.executeScript("arguments[0].click();", ketu);
			System.out.println("is available");
		}
		else {
			System.out.println("is not available");
		}
	}
	public void Item() throws InterruptedException {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Travel Adapters And Electronic Accessories from RTS']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		Pick_Item obj=new Pick_Item();
		obj.LaunchAUT();
		obj.Scrolling();
		obj.Mid();
		obj.Item();

	}

}
