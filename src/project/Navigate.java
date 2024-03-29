package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	WebDriver driver;
	public void NavigatePage() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	}
	public void Actions() throws InterruptedException {
		driver.navigate().to("http://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) throws InterruptedException {
		Navigate obj=new Navigate();
		obj.NavigatePage();
		obj.Actions();

	}

}
